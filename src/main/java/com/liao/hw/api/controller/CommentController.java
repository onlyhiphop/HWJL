package com.liao.hw.api.controller;

import com.liao.hw.api.entity.ResultBean;
import com.liao.hw.common.service.CommentService;
import com.liao.hw.common.utils.MyFileUtil;
import com.liao.hw.mbg.entity.Comment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @author LiaoBaoCai
 * @description: TODO
 * @date 2019/11/8 17:29
 */
@Slf4j
@RestController
@RequestMapping("${apiPath}/comment")
public class CommentController {

    @Value("${uploadPath}")
    private String uploadPath;
    @Value("${uploadRealPath}")
    private String uploadRealPath;

    @Autowired
    private CommentService commentService;

    @ModelAttribute(name = "openId")
    public String getUser(HttpServletRequest request){
        String openId = (String) request.getAttribute("openId");
        return openId;
    }

    /**
     * 得到所有评论
     * @return
     */
    @GetMapping("/list")
    public ResultBean list(){
        return ResultBean.success(commentService.findAllComment(null));
    }


    /**
     * 发表评论
     * @param comment
     * @param openId
     * @return
     */
    @PostMapping("/publish")
    public ResultBean publishComment(Comment comment,
                                     @ModelAttribute("openId") String openId){
        comment.setOpenId(openId);
        commentService.saveComment(comment);
        return ResultBean.success(null);
    }

    /**
     * 上传图片
     * @param imgFiles
     * @param openId
     * @return
     */
    @PostMapping("/publish/img")
    public ResultBean publishImg(@RequestParam(value = "imgFiles") List<MultipartFile> imgFiles,
                                 @ModelAttribute("openId") String openId) throws IOException {
        //保存上传的文件路径，不同文件用;隔开
        StringBuilder filePathStr = new StringBuilder();
        for (MultipartFile file:imgFiles) {
            String originName = file.getOriginalFilename();
            String contentType = file.getContentType();
            if (file.isEmpty() || StringUtils.isEmpty(originName)){
                log.error("上传图片失败， name：{}，type：{}", originName, contentType);
                return ResultBean.failed("无效的图片");
            }
            log.info("上传图片：name = {}， type = {}", originName, contentType);
            String extFileName = originName.substring(originName.lastIndexOf('.'));
            //新文件名称
            String newFileName = MyFileUtil.generNewName(extFileName);
            filePathStr.append(uploadPath).append(newFileName).append(";");
            //上传文件路径
            File imgFile = new File(uploadRealPath, filePathStr.toString());
            if(!imgFile.getParentFile().exists()){
                imgFile.mkdir();
            }
            file.transferTo(imgFile);
            log.info("上传图片到服务器成功： URI：{}", imgFile.getAbsolutePath());
        }
        //删除最后一个;
        filePathStr.deleteCharAt(filePathStr.length() - 1);
        return ResultBean.success(filePathStr.toString());
    }


}

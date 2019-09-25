package com.jhr.controller;

import com.jhr.service.bo.BookBO;
import com.jhr.controller.vo.BookVO;
import com.jhr.service.FindBookById;
import com.jhr.utils.base.BaseRsp;
import com.jhr.utils.base.BaseRspConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * <br>
 * 标题：
 * 描述：
 *
 * @author jhr
 * @create 2019/08/20 15:02
 */
@Controller
@RequestMapping("/lecture")
public class BookController {
    public static final Logger LOGGER = LoggerFactory.getLogger(BookController.class);
    @Autowired
    private FindBookById findBookById;

    /**
     * 根据id查询
     * @param bookVO
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/findBookById", method = RequestMethod.POST)
    public BaseRsp<BookVO> findBookById(@RequestBody BookVO bookVO) {
        BaseRsp<BookVO> baseRsp=new BaseRsp<>();
        BookVO rspVO=new BookVO();
        try {
            if (bookVO == null) {
                baseRsp.setRespCode(BaseRspConstants.CODE_FAILUR);
                baseRsp.setRespDesc("参数为空");
                return baseRsp;
            }
            BookBO bookBO=new BookBO();
            BeanUtils.copyProperties(bookVO,bookBO);
            BookBO bo = findBookById.findBookById(bookBO);
            BeanUtils.copyProperties(bo,rspVO);
            baseRsp.setData(rspVO);
            baseRsp.setRespCode(BaseRspConstants.CODE_SUCCESS);
            baseRsp.setRespDesc(BaseRspConstants.RSP_DESC_SUCCESS);
        }catch (Exception e){
            LOGGER.error("BookController========>findBookById失败", e);
            baseRsp.setRespCode(BaseRspConstants.CODE_FAILUR);
            baseRsp.setRespDesc(BaseRspConstants.RSP_DESC_ERROR);
            return baseRsp;
        }

        return  baseRsp;
    }

}

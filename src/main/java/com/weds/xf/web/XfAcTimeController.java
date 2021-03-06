package com.weds.xf .web;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Api;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import javax.validation.Valid;

import com.weds.core.base.BaseController;
import com.weds.core.annotation.Logs;
import com.weds.core.resp.JsonResult;
import com.weds.core.base.BaseCommPager;
import com.weds.core.base.BasePageSearch;

import com.weds.xf.entity .XfAcTimeEntity;
import com.weds.xf.service .XfAcTimeService;

/**
 * @Author
 * @Description XfAcTime管理
 * @Date 2020-03-22
 */
@RestController
@RequestMapping(value="/xfAcTime")
@Api(value = "XfAcTime管理", description = "XfAcTime管理")
public class XfAcTimeController extends BaseController{
	@Resource
	private XfAcTimeService xfAcTimeService;

    
	
	private Logger log = LogManager.getLogger();

    @Logs
	@ApiOperation(value = "新增XfAcTime信息", notes = "新增XfAcTime信息")
	@RequestMapping(value = "/insert", method = RequestMethod.PUT)
	public JsonResult<Object> insert(@RequestBody @Valid XfAcTimeEntity record) {
        				xfAcTimeService.insertSelective(record);
		return succMsg();
	}

	@Logs
	@ApiOperation(value = "更新XfAcTime信息", notes = "更新XfAcTime信息")
	@RequestMapping(value = "/updateByPrimaryKey", method = RequestMethod.POST)
	public JsonResult<Object> updateByPrimaryKey(@RequestBody @Valid XfAcTimeEntity record) {
        		xfAcTimeService.updateByPrimaryKeySelective(record);
		return succMsg();
	}

	
		@Logs
	@ApiOperation(value = "删除XfAcTime信息", notes = "删除XfAcTime信息")
	@RequestMapping(value = "/deleteByPrimaryKey", method = RequestMethod.DELETE)
	public JsonResult<Object> deleteByPrimaryKey(@RequestParam Integer xh) {
        xfAcTimeService.deleteByPrimaryKey(xh);
        return succMsg();
	}

	@Logs
	@ApiOperation(value = "查询XfAcTime信息", notes = "查询XfAcTime信息")
	@RequestMapping(value = "/selectByPrimaryKey", method = RequestMethod.GET)
	public JsonResult<XfAcTimeEntity> selectByPrimaryKey(@RequestParam Integer xh) {
		XfAcTimeEntity entity = xfAcTimeService.selectByPrimaryKey(xh);
                return succMsgData(entity);
	}
	

	
	}
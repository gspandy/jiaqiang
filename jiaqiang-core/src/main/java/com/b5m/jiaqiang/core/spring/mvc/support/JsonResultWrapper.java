package com.b5m.jiaqiang.core.spring.mvc.support;

/**
 * Action返回结果包装对象<br/>
 * 系统内的Action接口大多直接返回JsonObect对象,并借助ResponseBody直接渲染到String返回<br/>
 * 现在要统一使用JsonResult来替换之,但暂时没有那么多的时间去做,因此有了这个Action返回结果中间类型<br/>
 * JsonResultHandler会特殊处理该类型的返回结果
 * 
 * @author 丹青生
 * 
 * @date 2015-7-22
 */
public class JsonResultWrapper {

	private Object data;

	public JsonResultWrapper() {}
	
	public JsonResultWrapper(Object data) {
		this.data = data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Object getData() {
		return data;
	}

}

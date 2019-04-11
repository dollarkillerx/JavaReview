package com.imooc.json;

import java.util.Calendar;

import com.alibaba.fastjson.JSON;

public class FastJsonSample1 {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setEmpno(4488);
		employee.setEname("王晓东");
		employee.setSalary(1000f);
		employee.setDname("市场部");
		Calendar c = Calendar.getInstance();
		c.set(2019, 0,30,0,0,0);
		employee.setHdate(c.getTime());
		// FastJSON 提供了JSON对象，完成对象与JSON的装换
		String json = JSON.toJSONString(employee);
		System.out.println(json);
		Employee emp = JSON.parseObject(json,Employee.class);
		System.out.println(emp);
	}
}

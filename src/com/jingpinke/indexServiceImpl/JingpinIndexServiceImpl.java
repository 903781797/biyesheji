package com.jingpinke.indexServiceImpl;

import java.util.List;
import java.util.Map;

import com.jingpinke.homeDao.JingpinIIndexDao;
import com.jingpinke.indexService.JingpinIIndexService;

public class JingpinIndexServiceImpl implements JingpinIIndexService {
	private JingpinIIndexDao jingpinIndexDao ;

	public JingpinIIndexDao getJingpinIndexDao() {
		return jingpinIndexDao;
	}

	public void setJingpinIndexDao(JingpinIIndexDao jingpinIndexDao) {
		this.jingpinIndexDao = jingpinIndexDao;
	}

	@Override
	public List JingpinHomeService() {
		List<Object[]> list = jingpinIndexDao.JinpinHomeDao();
		int size = list.size();
		System.out.print("1   ");
		System.out.print("2   ");
		System.out.print("3   ");
		System.out.print("4   ");
		System.out.println("5   ");

		for(Object[] obj:list){
			System.out.print(obj[0]+" ");
			System.out.print(obj[1].toString()+" ");
			System.out.print(obj[2]+" ");
			System.out.print(obj[3]+" ");
			System.out.println(obj[4]+" ");
			
		}
//		for(int i = 0;i<size;i++){
//			System.out.println(list.get(i).get("ctId"));
//			System.out.println(list.get(i).get("ctName"));
//			System.out.println(list.get(i).get("count"));
//			System.out.println(list.get(i).get("coid"));
//			System.out.println(list.get(i).get("coName"));
//		}
		return list;
	}

}

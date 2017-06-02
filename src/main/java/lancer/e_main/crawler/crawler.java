package lancer.e_main.crawler;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class crawler {
	
	//String crw()throws Exception{
		public static void main(String args[])throws Exception{
		String articleURL = "http://news.naver.com/main/main.nhn?mode=LSD&mid=shm&sid1=105"; // 신문기사
																										// URL
		Document doc = Jsoup.connect(articleURL).get(); // document 객체 생성.
		Elements ele = doc.select(".content"); // 아이디가 _article인 div 태그 선택
		String str = ele.text(); // 값 저장
		System.out.println(str+"\n");
		
		
		}
	//}
}

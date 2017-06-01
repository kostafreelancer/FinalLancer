package lancer.total.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import lancer.total.service.E_MypageService;

@Controller
@RequestMapping("/e_mypage/*")
public class E_MypageController {

	@Inject
	private E_MypageService service;
	
	@RequestMapping(value = "/e_info", method = RequestMethod.GET)
	public void e_infoGET(){
		
	}
	
	@RequestMapping(value = "/e_project", method = RequestMethod.GET)
	public void e_projectGET(){
		
	}
	
	@RequestMapping(value = "/e_projectInfo", method = RequestMethod.GET)
	public void e_projectInfoGET(){
		
	}
	
	@RequestMapping(value = "/e_projectUpdate", method = RequestMethod.GET)
	public void e_projectUpdateGET(){
		
	}
	
	
	
	
/*	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public void registerGET(BoardVO board, Model model) throws Exception{
		logger.info("register get ..........");
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registPOST(BoardVO board, Model model) throws Exception{
		logger.info("regist post ..........");
		logger.info(board.toString());
		
		service.regist(board);
		
		model.addAttribute("msg", "success");
		
		//return "/board/success";
		return "redirect:/board/listAll";
	}
	
	@RequestMapping(value = "/listAll", method = RequestMethod.GET)
	public void listAll(Model model) throws Exception{
		logger.info("show list..........");
		model.addAttribute("list", service.listAll());
	}
	
	@RequestMapping(value = "/listCri", method = RequestMethod.GET)
	public void listCri(Criteria cri, Model model) throws Exception{
		logger.info("show list Page with Criteria..........");
		model.addAttribute("list", service.listCriteria(cri));
	}
	
	@RequestMapping(value = "/listPage", method = RequestMethod.GET)
	public void listPage(Criteria cri, Model model)throws Exception{
		
		logger.info(cri.toString());
		
		model.addAttribute("list", service.listCriteria(cri));
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(service.listCountCriteria(cri));
		
		model.addAttribute("pageMaker", pageMaker);
	}
	
	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public void read(@RequestParam("bno") int bno, Model model) throws Exception{
		logger.info("read.....");
		model.addAttribute(service.read(bno));
	}
	
	@RequestMapping(value = "/readPage", method = RequestMethod.GET)
	public void read(@RequestParam("bno") int bno, 
								@ModelAttribute("cri") Criteria cri, 
								Model model)throws Exception{
		
		model.addAttribute(service.read(bno));
	}
	
	
	@RequestMapping(value = "/remove", method = RequestMethod.POST)
	public String remove(@RequestParam("bno") int bno, Model model)throws Exception{
		service.remove(bno);
		
		model.addAttribute("msg", "SUCCESS");
		
		return "redirect:/board/listAll";
	}
	
	@RequestMapping(value = "/removePage", method = RequestMethod.POST)
	public String remove(@RequestParam("bno") int bno, Criteria cri, Model model)throws Exception{
		service.remove(bno);
		
		model.addAttribute("page", cri.getPage());
		model.addAttribute("perPageNum", cri.getPerPageNum());
		model.addAttribute("msg", "SUCCESS");
		
		return "redirect:/board/listPage";
	}
	
	@RequestMapping(value = "/modify", method = RequestMethod.GET)
	public void modifyGET(int bno, Model model)throws Exception{
		model.addAttribute(service.read(bno));
	}
	
	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public String modifyPOST(BoardVO board, Model model)throws Exception{
		logger.info("mod post............");
		
		service.modify(board);
		model.addAttribute("msg", "SUCCESS");
		
		return "redirect:/board/listAll";
	}
	
	@RequestMapping(value = "/modifyPage", method = RequestMethod.GET)
	public void modifyPagingGET(@RequestParam("bno")int bno, @RequestParam("cri") Criteria cri, Model model)throws Exception{
		model.addAttribute(service.read(bno));
	}
	
	@RequestMapping(value = "/modifyPage", method = RequestMethod.POST)
	public String modifyPagingPOST(BoardVO board, Criteria cri, Model model)throws Exception{
		logger.info("mod post............");
		
		service.modify(board);
		model.addAttribute("page", cri.getPage());
		model.addAttribute("perPageNum", cri.getPerPageNum());
		model.addAttribute("msg", "SUCCESS");
		
		return "redirect:/board/listPage";
	}*/
	
}

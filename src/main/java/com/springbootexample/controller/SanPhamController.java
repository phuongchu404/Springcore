package com.springbootexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springbootexample.entity.LoaiSPEntity;
import com.springbootexample.entity.SanPhamEntity;
import com.springbootexample.service.LoaiSPService;
import com.springbootexample.service.SanPhamService;

@Controller
@RequestMapping("/sanpham")
public class SanPhamController {

	@Autowired
	private SanPhamService sanPhamService;
	
	@Autowired
	private LoaiSPService loaiSPService;

	@GetMapping("/getAll")
	public String showList(Model model) {
		List<SanPhamEntity> list=sanPhamService.findAll();
		model.addAttribute("list", list);
		
		return "/admin/sanpham/list";
	}
	
	@GetMapping("/add")
	public String add(Model model) {	
		model.addAttribute("loaiSP", loaiSPService.findAll());
		model.addAttribute("sanpham", new SanPhamEntity());
		return "/admin/sanpham/add";
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute("sanpham") SanPhamEntity sanpham) {
		SanPhamEntity sp=sanpham;
		
		sanPhamService.save(sanpham);
		return "redirect:/sanpham/getAll";
	}
	
	@GetMapping("/edit/{maSP}")
	public ModelAndView edit(@PathVariable(name="maSP") Long maSP) {
		ModelAndView mav=new ModelAndView("/admin/sanpham/edit");
		SanPhamEntity sp=sanPhamService.findById(maSP).get();
		Long maloaiSP=sp.getLoaiSPs().getMaLoaiSP();
		mav.addObject("sanpham", sp);
		mav.addObject("maloaiSP", maloaiSP);
		mav.addObject("loaiSP", loaiSPService.findAll());
		return mav;
	}
	@GetMapping("/delete/{maSP}")
	public String delete(@PathVariable(name="maSP") Long maSP) {
		sanPhamService.deleteById(maSP);
		return "redirect:/sanpham/getAll";
	}
	
}

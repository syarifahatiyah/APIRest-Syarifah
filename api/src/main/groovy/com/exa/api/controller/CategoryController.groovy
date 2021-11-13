package com.exa.api.controller
import com.exa.api.entity.Category
import com.exa.api.service.CategoryService
import org.springframework.web.bind.annotation.*
import org.springframework.beans.factory.annotation.Autowired

@RestController
@RequestMapping('/categories')
class CategoryController {
 @Autowired
 private final CategoryService categoryService
 @GetMapping('')
 List<Category> findAll() {
 categoryService.findAll()
 }
}
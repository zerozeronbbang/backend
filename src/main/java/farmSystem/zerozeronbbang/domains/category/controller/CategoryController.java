package farmSystem.zerozeronbbang.domains.category.controller;

import farmSystem.zerozeronbbang.domains.category.dto.ResFindCategoriseDto;
import farmSystem.zerozeronbbang.domains.category.service.impl.CategoryServiceImpl;
import farmSystem.zerozeronbbang.response.CustomResponseEntity;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Category", description = "카테고리 관련 api")
@RequiredArgsConstructor
@RestController
public class CategoryController {

    private final CategoryServiceImpl categoryService;

    @Operation(summary = "category select", description = "메인 페이지 category select 컨트롤러")
    @GetMapping(value = "/categories")
    public CustomResponseEntity<List<ResFindCategoriseDto>> findCategories(@AuthenticationPrincipal final String email){
        List<ResFindCategoriseDto> categories = categoryService.findCategories();
        return CustomResponseEntity.success(categories);
    }
}

package com.davi.shop.resources;

import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

public interface RedirectControllerAPI {

    public RedirectView redirectWithUsingRedirectView(
	    RedirectAttributes attributes);

}

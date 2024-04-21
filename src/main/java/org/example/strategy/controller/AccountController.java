package org.example.strategy.controller;

import lombok.RequiredArgsConstructor;
import org.example.strategy.services.CustomerForwardStrategyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2/account")
@RequiredArgsConstructor
public class AccountController {

    private final CustomerForwardStrategyService customerForwardStrategyService;


  @GetMapping("/{type}")
    public String getAccountType(@PathVariable String type) {
      return customerForwardStrategyService.customerForward(type);
  }
}

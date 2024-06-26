package org.example.manuel;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/account")
@RequiredArgsConstructor
public class AccountManuelController {
    private final CustomerForwardManuelService customerForwardService;

    @GetMapping("/{type}")
    public String getAccountType(@PathVariable String type) {
      return customerForwardService.customerForward(type);
        }
    }


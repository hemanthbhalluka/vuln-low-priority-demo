package com.demo.app.controller;
// VULN: CWE-598 (LOW) - Sensitive data (password) accepted via GET query string, which
// commonly ends up logged in access logs, browser history, and proxy caches.
import org.springframework.web.bind.annotation.*;
@RestController @RequestMapping("/api/account")
public class PasswordResetController {
    @GetMapping("/reset-password")
    public String resetPassword(@RequestParam String username, @RequestParam String newPassword) {
        return "Password updated for " + username;
    }
}
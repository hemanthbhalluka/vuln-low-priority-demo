package com.demo.app.service;
// VULN: CWE-532 (LOW) - Sensitive information (raw password) written to application logs
import org.springframework.stereotype.Service;
import java.util.logging.Logger;
@Service
public class AuditLogService {
    private static final Logger LOGGER = Logger.getLogger(AuditLogService.class.getName());
    public void logLoginAttempt(String username, String password, boolean success) {
        LOGGER.info("Login attempt user=" + username + " password=" + password + " success=" + success);
    }
}
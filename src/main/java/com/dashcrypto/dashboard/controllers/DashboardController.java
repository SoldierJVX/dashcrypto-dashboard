package com.dashcrypto.dashboard.controllers;


import com.dashcrypto.dashboard.services.DashboardService;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@OpenAPIDefinition(
        info = @Info(
                title = "API Dashboard - DashCrypto Application",
                version = "1.0",
                description = "API REST Dashboard",
                contact = @Contact(
                        name = "João Silva",
                        email = "jv_rss@hotmail.com"
                ),
                license = @License(
                        url = "http://www.apache.org/licenses/LICENSE-2.0.html",
                        name = "Apache 2.0"
                )
        )
)
@Slf4j
@RestController
@RequestMapping("/dashboard")
@CrossOrigin(origins = "*", maxAge = 3600)
public class DashboardController {

    private final DashboardService dashboardService;

    public DashboardController(DashboardService dashboardService) {
        this.dashboardService = dashboardService;
    }

    @GetMapping("/listcrypto")
    @Operation(summary = "Returns list cryptos")
    public ResponseEntity<Object> getListCryptos() {
        List<String> lstCryptos = dashboardService.getListCryptos();
        return ResponseEntity.ok(lstCryptos);
    }

}

package com.example.ndthongTestTomcathgh;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
@GetMapping
String Index() {
	return "Ngo dinh thong tesst";
}
}

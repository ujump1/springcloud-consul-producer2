package api;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "spring-cloud-producer",path = "config")
public interface ITestConfigService {

	@GetMapping("/getConfig")
	String getConfig();

}

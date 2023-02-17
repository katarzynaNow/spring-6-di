package guru.springframework.spring6di.services.environmentServices;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile({"dev", "default"})
@Service
public class EnvironmentServiceDev implements EnvironmentService {
    @Override
    public String getEnv() {
        return "dev";
    }
}

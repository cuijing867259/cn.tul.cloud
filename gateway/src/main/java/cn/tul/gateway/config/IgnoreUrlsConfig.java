package cn.tul.gateway.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * <br>
 * 网关白名单配置
 * @author cuijing
 * @className IgnoreUrlsConfig
 * @date 2021-03-15 02:12
 */
@Getter
@Setter
@Component
@ConfigurationProperties(prefix="secure.ignored")
public class IgnoreUrlsConfig {
    private List<String> urls = new ArrayList<>();
}

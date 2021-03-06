/*
 * Copyright 2018 Red Hat, Inc, and individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.snowdrop.data.gcp.gae;

import me.snowdrop.data.core.repository.config.EnableSnowdropRepositories;
import me.snowdrop.data.core.spi.DatasourceMapper;
import me.snowdrop.data.gcp.GcpSearchRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author <a href="mailto:ales.justin@jboss.org">Ales Justin</a>
 */
@Configuration
@EnableSnowdropRepositories(basePackageClasses = GcpSearchRepository.class)
public class GaeSearchConfiguration {
    @Bean
    public DatasourceMapper datasourceMapper() {
        return new GaeDatasourceMapper();
    }
}

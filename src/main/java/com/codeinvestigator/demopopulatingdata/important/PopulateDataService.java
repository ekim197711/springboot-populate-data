package com.codeinvestigator.demopopulatingdata.important;

import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.init.DatabasePopulator;
import org.springframework.jdbc.datasource.init.DatabasePopulatorUtils;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

@Service
public class PopulateDataService {

    private final DataSource dataSource;

    public PopulateDataService(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @PostConstruct
    public void initData(){
        // schema init
        ClassPathResource initSchema = new ClassPathResource("script/populateWithSchema.sql");
        DatabasePopulator databasePopulator = new ResourceDatabasePopulator(initSchema);
        DatabasePopulatorUtils.execute(databasePopulator, dataSource);

        ClassPathResource initData = new ClassPathResource("script/populateWithData.sql");
        databasePopulator = new ResourceDatabasePopulator(initData);
        DatabasePopulatorUtils.execute(databasePopulator, dataSource);
    }
}

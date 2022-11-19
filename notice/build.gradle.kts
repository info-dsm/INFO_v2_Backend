dependencies {
    implementation(project(":commonEntity"))
    implementation(project(":common"))
    //Annotation Processor
    annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")
    //JPA
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    //MySQL driver
    implementation("mysql:mysql-connector-java:8.0.31")
    //Eureka Client
    implementation("org.springframework.cloud:spring-cloud-starter-netflix-eureka-client:3.1.4")
    //OpenFiegn
    implementation("org.springframework.cloud:spring-cloud-starter-openfeign:3.1.5")
    //Hystrix
    implementation("org.springframework.cloud:spring-cloud-starter-netflix-hystrix:2.2.10.RELEASE")
    //Kafka
    implementation("org.springframework.kafka:spring-kafka")
    //commonMulitpartfile
    implementation("commons-fileupload:commons-fileupload:1.4")
    //Validation
    implementation("org.springframework.boot:spring-boot-starter-validation:2.7.4")

}
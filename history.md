[2026/04/23]
- JDK, Spring Boot, Spring Framework 현행화
  + JDK 25
  + Spring Boot: 4.0.3
  + Spring Framework: 7.0.5
- 신규
  + open.commons.spring.oshi.autoconfigure.OpenCommonsSpringOshiCoreAutoConfiguration 추가
    + 사용자 결정에 따라 기본 '빈'  제공. (@ConditionalOnMissBean(name = ...)

[2025/07/24]
- Dependencies
  + 추가
    + jakarta.validation:jakarata.validation-api:${managed-version}
    + com.google.code.findbugs:jsr305:${managed-version}
   
[2025/02/21]
Apply 'Maven Central Deployment'

- 갱신
  + <deploymentManagement>
    + Release: Maven Central (https://central.sonatype.com)
  + 'open.commons' dependencies 
    + groupId: io.github.open-commons
- 추가
  + <build>
    + org.sonatype.central:central-publishing-maven-plugin
    + org.apache.maven.plugins:maven-gpg-plugin

[2025/02/17]
- Snapshot: 0.3.0-SNAPSHOT
- Dependencies:
  + open-commons-spring-web-dependencies: 0.8.0-SNAPSHOT

[2025/02/17]
- Release: 0.2.0

[2024/10/31]
- 기타
  + Maven Repository 주소 변경 (http -> https)
  
[2022/11/17]
- Dependencies
	+ spring-core.version: 5.3.23 고정
	
[2022/04/07]
- Release: 0.2.0-SNAPSHOT
- Tage: 0.1.0
- Dependencies:
  + open.commons.core: 2.0.0-SNAPSHOT

[2022/04/07]
- Release: 0.1.0


[2021/11/23]
- 신규
  + open.commons.spring.oshi.service.ISystemService
  + open.commons.spring.oshi.service.impl.SystemService
  
[2021/11/16]
- 신규
  + open.commons.spring.oshi.service.INetworkService
  + open.commons.spring.oshi.service.impl.NetworkService
  + open.commons.spring.oshi.data.ResourceNotFoundException
- 변경
  + open.commons.spring.oshi.service.ResourceService: Bean Qualifier Literal 추가.

[2021/11/05]
- Create the Project.
- 신규
  + open.commons.spring.oshi.data
    + Cpu
    + CpuCore
    + DiskStatus
    + Memory
    + Network
    + Nic
    + Storage
    + SystemRunning
    + SystemStatus
    + Timestamped
  + open.commons.spring.oshi.service
    + IResourceService
  + open.commons.spring.oshi.service.impl
    + ResourceService

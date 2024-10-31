[2024/10/31]
- ETC
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
- New
  + open.commons.spring.oshi.service.ISystemService
  + open.commons.spring.oshi.service.impl.SystemService
  
[2021/11/16]
- New
  + open.commons.spring.oshi.service.INetworkService
  + open.commons.spring.oshi.service.impl.NetworkService
  + open.commons.spring.oshi.data.ResourceNotFoundException
- Modify
  + open.commons.spring.oshi.service.ResourceService: Bean Qualifier Literal 추가.

[2021/11/05]
- Create the Project.
- New
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

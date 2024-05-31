# clean-architecture
Repository of clean architecture template by me implements in spring boot

Detail explaination for this clean arch

Structure directory clean architecture
![alt text](https://github.com/amifth/clean-architecture/blob/main/docs/structured-clean-arch.png)

application
    - config
    - stereotype
    - common
    - http
core
    - usecase
        - Usecase
        - Input/Output boundary
    - mappers
domain
    - payload
    - dto
infrastructure
    - adapters
        - postgres
        - mysql
        - aws
    - port
      - repository
      - query
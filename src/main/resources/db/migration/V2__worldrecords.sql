create table world_record
(
    id            bigint not null auto_increment,
    description   varchar(255),
    value_d			DOUBLE(10,2),
    unit_of_measure varchar(255),
    date_of_record date,
    recorder_name  varchar(255),
    recorder_id BIGINT,
    PRIMARY KEY  (id)
)

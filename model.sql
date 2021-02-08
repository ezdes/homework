create table customer (
   id                   int                  primary key,
   first_name           varchar(100)         not null,
   last_name            varchar(100)         not null,
   city                 varchar(100)         null,
   country              varchar(100)         null,
   phone                varchar(100)         null

);

create table supplier (
   id                    int                  primary key,
   company_name          varchar(100)         not null,
   contact_name          varchar(100)         null,
   contact_title         varchar(100)         null,
   city                  varchar(100)         null,
   country               varchar(100)         null,
   phone                 varchar(100)         null,
   fax                   varchar(100)         null
);

create table product (
   id                    int                  primary key,
   product_name          varchar(100)         not null,
   unit_price            decimal(12,2)        null default 0,
   package               varchar(100)         null,
   is_discontinued       boolean              not null default false,
   supplier_id           int                  references supplier(id) not null
);

create table orders (
   id                    int                  primary key,
   order_date            timestamp            not null default now(),
   order_number          varchar(100)         null,
   total_amount          decimal(12,2)        null default 0,
   customer_id           int                  references customer(id) not null
);

create table order_item (
   id                    int                  primary key,
   unit_price            decimal(12,2)        not null default 0,
   quantity              int                  not null default 1,
   order_id              int                  references orders(id) not null,
   product_id            int                  references product(id) not null
);

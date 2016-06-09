
CREATE SCHEMA account;

CREATE SCHEMA calender;

CREATE TABLE account.user
(
 id character varying(16) NOT NULL,
 password character varying(16) NOT NULL,
 name character varying(20) NOT NULL,
 updated_at timestamp NOT NULL default now(),
 PRIMARY KEY(id)
);

CREATE TABLE calender.performance
(
 id integer NOT NULL,
 user_id character varying(16) NOT NULL,
 name character varying(50) NOT NULL,
 site_url character varying(100) NOT NULL,
 place character varying(50) NOT NULL,
 place_url character varying(100) NOT NULL,
 start_date date NOT NULL,
 end_date date NOT NULL,
 memo text NOT NULL,
 updated_at timestamp NOT NULL default now(),
 PRIMARY KEY (id),
 FOREIGN KEY (user_id) REFERENCES account.user (id) ON DELETE NO ACTION ON UPDATE NO ACTION
);

CREATE TABLE calender.holiday
(
 id integer NOT NULL,
 performance_id integer NOT NULL,
 holiday_date date NOT NULL,
 created_at timestamp NOT NULL default now(),
 PRIMARY KEY (id),
 FOREIGN KEY (performance_id) REFERENCES calender.performance (id) ON DELETE NO ACTION ON UPDATE NO ACTION
);

CREATE TABLE calender.schedule
(
 id integer NOT NULL,
 performance_id integer NOT NULL,
 fix_date date NOT NULL,
 open_time time NOT NULL,
 start_time time NOT NULL,
 ticket_price integer NOT NULL,
 budget integer NOT NULL,
 memo text NOT NULL,
 implession text NOT NULL,
 updated_at timestamp NOT NULL default now(),
 PRIMARY KEY (id),
 FOREIGN KEY (performance_id) REFERENCES calender.performance (id) ON DELETE NO ACTION ON UPDATE NO ACTION
);

CREATE TABLE calender.tentative_schedule
(
 schedule_id integer NOT NULL,
 created_at timestamp NOT NULL default now(),
 PRIMARY KEY (schedule_id)
);
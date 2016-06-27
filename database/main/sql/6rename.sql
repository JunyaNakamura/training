ALTER TABLE performance.holiday RENAME COLUMN holiday_date TO suspend_date;
ALTER TABLE performance.holiday RENAME TO suspend;
ALTER TABLE performance.suspend ALTER COLUMN id SET DEFAULT nextval('performance.suspend_id');
DROP TRIGGER IF EXISTS tirgger_upd_classtime
ON class_time;
DROP FUNCTION IF EXISTS is_class_time_valid(time_id integer, s TIME, e TIME );
DROP FUNCTION IF EXISTS classtime_upd;
DROP FUNCTION IF EXISTS min(a time, b time );
DROP FUNCTION IF EXISTS max(a time, b time );


DROP TABLE IF EXISTS schedule_item_parity_to_lecturer CASCADE;
DROP TABLE IF EXISTS schedule_item_parity CASCADE;
DROP TABLE IF EXISTS schedule_item CASCADE;
DROP TABLE IF EXISTS schedule_day CASCADE;
DROP TABLE IF EXISTS day_of_weak CASCADE;
DROP TABLE IF EXISTS study_group CASCADE;
DROP TABLE IF EXISTS hours_per_class CASCADE;
DROP TABLE IF EXISTS calendar_item_cell CASCADE;
DROP TABLE IF EXISTS calendar_item CASCADE;
DROP TABLE IF EXISTS study_flow CASCADE;
DROP TABLE IF EXISTS dep_to_spec CASCADE;
DROP TABLE IF EXISTS specialization CASCADE;
DROP TABLE IF EXISTS department CASCADE;
DROP TABLE IF EXISTS edu_degree CASCADE;
DROP TABLE IF EXISTS faculty CASCADE;
DROP TABLE IF EXISTS "subject" CASCADE;
DROP TABLE IF EXISTS term CASCADE;
DROP TABLE IF EXISTS class_type CASCADE;
DROP TABLE IF EXISTS classroom CASCADE;
DROP TABLE IF EXISTS lecturer CASCADE;
DROP TABLE IF EXISTS class_time CASCADE;
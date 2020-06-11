function obj_task()
{
    var date = date_current_datetime();
    var date_inc = date + date_inc_day();
    
    category:   -1;
    type_:      -1;
    title:      "";
    notes:      "";
    url:        "";
    from_day:   date_get_day(date);
    from_month: date_get_month(date);
    from_year:  date_get_year(date);
    due_day:    date_get_day(date_inc);
    due_month:  date_get_month(date_inc);
    due_year:   date_get_year(date_inc);
    time_est:   30;
    repeats:    false;
    cleared:    false;
}
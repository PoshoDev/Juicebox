enum dt
{
    category,
    type_,
    title,
    notes,
    url,
    from_day,
    from_month,
    from_year,
    due_day,
    due_month,
    due_year,
    time_est,
    repeats,
    cleared,
    LENGTH
};

globalvar data;
data = ds_grid_create(dt.LENGTH, 0);
if (keyboard_check(vk_control))
{
	if (mouse_wheel_up() && block_size<block_max)
		block_size += block_add;
	else if (mouse_wheel_down() && block_size>block_min)
		block_size -= block_add;
}

switch(mode)
{
	case md.addnew:
		if (keyboard_check_pressed(ord("N")))
		{
			mode = md.standard;
			leftbar_x = room_width;
			task_new = noone;
		}
	break;
	
	
	default:
		if (keyboard_check_pressed(ord("N")))
		{
			mode = md.addnew;
			leftbar_x = room_width - popup_width;
			task_new = new obj_task();
		}
	break;
}

// The all.
if (task_new != noone)
	task_new.Step();
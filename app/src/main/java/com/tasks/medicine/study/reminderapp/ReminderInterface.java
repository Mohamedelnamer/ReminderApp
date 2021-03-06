package com.tasks.medicine.study.reminderapp;

public interface ReminderInterface {

    public void hideActionBar();
    public void showActionBar();
    public void addReminder(final String reminderTitle, final String reminderDTS, final long reminderTIM, final String reminderDTS2, final long reminderTIM2);
    public void updateReminder(final String reminderTitle, final String reminderDTS,final String reminderDTS2, final long reminderTIM, final int reminderId, final int reminderPosition);

}

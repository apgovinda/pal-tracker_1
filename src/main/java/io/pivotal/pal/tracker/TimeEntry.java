package io.pivotal.pal.tracker;

import java.time.LocalDate;

public class TimeEntry
{
    private long id;
    private long projectId;
    private long userId;
    private LocalDate date;
    private int hours;


    public TimeEntry()
    {


    }

    @Override
    public boolean equals(Object obj)
    {
        if( obj == this ) return true;
        if( obj == null ) return true;

        if( obj.getClass() != TimeEntry.class ) return false;

        TimeEntry te =  (TimeEntry)obj;

        if(te.id != this.id) return false;
        if(te.projectId != this.projectId) return false;
        if(te.userId != this.userId) return false;
        if(te.hours != this.hours) return false;


        return true;
        //return date != null ? date.equals(te.date) : te.date == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (projectId ^ (projectId >>> 32));
        result = 31 * result + (int) (userId ^ (userId >>> 32));
        //result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + hours;
        return result;
    }


    public TimeEntry(long pid, long uid, LocalDate d, int hrs)
    {
        projectId = pid;
        userId = uid;
        date = d;
        hours = hrs;
    }

    public TimeEntry(long tid , long pid, long uid, LocalDate d, int hrs)
    {
        id = tid;
        projectId = pid;
        userId = uid;
        date = d;
        hours = hrs;
    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public long getProjectId()
    {
        return projectId;
    }

    public long getUserId()
    {
        return userId;
    }

    public LocalDate getDate()
    {
        return date;
    }

    public int getHours()
    {
        return hours;
    }

}

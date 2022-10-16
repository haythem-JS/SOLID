package com.directi.training.ocp.exercise_refactored;

public class Time extends Resource
{
    private final int _resourceId;


    public Time(int resourceId)
    {
        _resourceId = resourceId;
    }

    @Override
    public void markResourceSlotFree(int resourceId)
    {
    }

    @Override
    public void markResourceSlotBusy(int resourceId)
    {
    }

    @Override
    public int findFreeResourceSlot()
    {
        return 0;
    }
}

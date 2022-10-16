package com.directi.training.ocp.exercise_refactored;

public abstract class Resource
{
    public abstract void markResourceSlotFree(int resourceId);
    public abstract void markResourceSlotBusy(int resourceId);
    public abstract int  findFreeResourceSlot();

}

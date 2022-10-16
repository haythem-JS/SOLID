package com.directi.training.ocp.exercise_refactored;

public class ResourceAllocator
{

    public int allocate( Resource resource)
    {
        int resourceId;
        resourceId = resource.findFreeResourceSlot();
        resource.markResourceSlotBusy(resourceId);
        return resourceId;
    }

    public void free(Resource resource, int resourceId)
    {
       resource.markResourceSlotFree(resourceId);
    }

}

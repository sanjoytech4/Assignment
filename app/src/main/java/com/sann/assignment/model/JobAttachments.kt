package com.sann.assignment.model

class JobAttachments {
    private var JobAttachment: Array<JobAttachment>? = null

    fun getJobAttachment(): Array<JobAttachment>? {
        return JobAttachment
    }

    fun setJobAttachment(JobAttachment: Array<JobAttachment>) {
        this.JobAttachment = JobAttachment
    }

}
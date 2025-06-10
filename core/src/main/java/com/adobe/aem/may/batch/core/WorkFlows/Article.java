package com.adobe.aem.may.batch.core.WorkFlows;

import com.adobe.granite.workflow.WorkflowException;
import com.adobe.granite.workflow.WorkflowSession;
import com.adobe.granite.workflow.exec.WorkItem;
import com.adobe.granite.workflow.exec.WorkflowProcess;
import com.adobe.granite.workflow.metadata.MetaDataMap;
import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(
    service = WorkflowProcess.class,
    immediate = true,
    enabled = true,
    property = {
        "process.label=Article100625"
    }
)
public class Article implements WorkflowProcess {

    private static final Logger LOGGER = LoggerFactory.getLogger(Article.class);
   

    @Override
    public void execute(WorkItem workItem, WorkflowSession workflowSession, MetaDataMap metaDataMap) throws WorkflowException {

        String payloadType = workItem.getWorkflowData().getPayloadType();
        LOGGER.info("{}: Payload type: {}", payloadType);

        if ("JCR_PATH".equals(payloadType)) {
            String path = workItem.getWorkflowData().getPayload().toString();
            LOGGER.debug("{}: Payload path: {}", path);
        }
    }

}

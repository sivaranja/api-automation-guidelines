# Utility/Helper Classes Documentation

## ABMUtil.java

    path : src/main/java/com/zoho/crm/spec/automation/custom/abm/orchestrations/ABMUtil.java

| Method | Parameters | Description |
|--------|------------|-------------|
| setDefault_account_config_details | Map<String, String> default_account_config_details | No description available |
| setDefault_contact_config_details | Map<String, String> default_contact_config_details | No description available |
| setDefault_product_config_details | Map<String, String> default_product_config_details | No description available |
| setDefault_deal_config_details | Map<String, String> default_deal_config_details | No description available |
| getDefaultTransition | String module | No description available |
| activateABM | None | No description available |
| activateAccount | String resourceName, String method | No description available |
| checkIfResourceExist | String resourceName | No description available |
| checkABMConfigured | boolean activate | No description available |
| createSegment | Map<String, Map<String, String>> segmentCriteria, String basedOn | No description available |
| getBody | String path | No description available |
| populateConfiguration | String resourceName | No description available |
| loadFields | None | No description available |
| loadRL | None | No description available |
| deactivateABM | None | No description available |
| createOrchestrations | String segmentId, String module | No description available |
| updateOrchestration | String orchestrationId, Map<String, Map<String, String>> transition, List<String> fromState | No description available |
| getOrchestrationBody | String orchestrationId, Map<String, Map<String, String>> transition, List<String> fromState | No description available |
| createStates | String module, String orchestrationId, int noOfStates | No description available |
| getStateBody | String module, String orchestrationId, int noOfStates | No description available |
| getTransitionBody | String orchestrationId, List<String> toState, List<String> fromState, JSONArray default_transition_triggers | No description available |
| createDraftOrchestration | String segmentId, String module | No description available |
| deleteOrchestrations | String ids | No description available |
| getOrchestrationsBody | String segmentId, String module | No description available |

## IntegrationUtil.java

    path : src/main/java/com/zoho/crm/spec/automation/custom/scoringrules/IntegrationUtil.java

| Method | Parameters | Description |
|--------|------------|-------------|
| enableOrDisableVisitsModule | ResourceHandler handler, Method method | No description available |
| enableOrDisableVOC | ResourceHandler handler, boolean enable | No description available |
| enableOrDisableWebinar | ResourceHandler handler, boolean enable | No description available |
| enableOrDisableCampaigns | ResourceHandler handler, boolean enable | No description available |
| enableSurveyIntegraion | boolean enable, Method method | No description available |
| getSurveyBody | None | No description available |
| getPortal | None | No description available |

## ScoringRulesUtil.java

    path : src/main/java/com/zoho/crm/spec/automation/custom/scoringrules/ScoringRulesUtil.java

| Method | Parameters | Description |
|--------|------------|-------------|
| createScoringRule | JSONObject body, OAuth2 auth | No description available |
| getScoringRules | String id | No description available |
| deleteRuleById | String id, OAuth2 auth | No description available |
| deleteRule | Key key, String id, ResourceHandler resourceHandler | No description available |
| deleteAllScoringRules | ResourceHandler handler | No description available |
| runScoringRules | String module, String ruleId | No description available |
| runDailyScheduler | String module | No description available |
| deleteVOCData | None | No description available |
| getAvailableSources | String module | No description available |
| linkSources | String name | No description available |
| getmoduleConfiguration | String module | No description available |
| deleteModuleConfiguration | String module, String id | No description available |
| createSignal | String nameSpace, String signalName | No description available |
| createExtension | String name | No description available |
| getVersion | None | No description available |
| setVersion | String ver | No description available |
| getTouchPointRuleCallsGroupBody | String module | No description available |
| getTouchPointRulesBody | String module, String groupName | No description available |
| getRules | String groupName | No description available |
| getTouchPointRuleCallsDurationBody | String module | No description available |
| getFieldRulesBody | String module | No description available |
| getScoringRuleBody | String type, String module, String ziaScoreType, OAuth2 auth | No description available |
| getManualRuleBody | String module | No description available |
| getZiaScoringRuleBody | String module, String type | No description available |
| getCriteriaJSON | Map<String, Object> fieldOJ | No description available |
| getChildModuleCriteria | String module | No description available |

## GetSystemQueryDetailsUtil.java

    path : src/main/java/com/zoho/crm/spec/automation/custom/bulk/GetSystemQueryDetailsUtil.java

| Method | Parameters | Description |
|--------|------------|-------------|
| CreateField | String fieldsUrlBuilder, String method, String module, String lookupFieldName, String parentModuleField, String lookupModuleField, String lookupModule | No description available |
| recordCase | URLBuilder urlBuilder, String lookupModuleField, String parentFieldValue, String parentModuleField, String lookupFieldName, boolean setField, String recordId | No description available |

## kiosksUtil.java

    path : src/main/java/com/zoho/crm/spec/automation/custom/kiosks/kiosksUtil.java

| Method | Parameters | Description |
|--------|------------|-------------|
| createkiosks | JSONObject kiosksBody, String kiosksName | No description available |
| getkiosksInfoById | String id | No description available |
| getkiosksGetRecordById | String kiosksId, JSONObject kiosksGetRecordBodyJson, String version | No description available |
| createkiosksState | String kiosksId, JSONObject kiosksStateBodyJson, String version | No description available |
| deleteKiosks | List<String> kioskIds, String version | No description available |
| getStateTransitionId | String kiosksId, String stateId, String version | No description available |
| createScreenWithCustomFieldState | String kiosksId, String kiosksName, String getRecordName, String fieldName, String transitionId, String version | No description available |
| getkiosksStateJsonBody | String transitionId, String getRecordId, String fieldId, String fieldName, String processId | No description available |
| constructGetRecordsJson | String moduleNm, String getRecordName, String moduleId, String moduleName, String fieldId, String fieldName | No description available |

## RecordUtil.java

    path : src/main/java/com/zoho/crm/spec/automation/custom/record/RecordUtil.java

| Method | Parameters | Description |
|--------|------------|-------------|
| createAndGetRecordId | String module | No description available |
| getRequiredModuleLayoutFields | String module, String layoutId | No description available |
| getFieldsByType | String module, String type | No description available |
| getRecordId | String module, String operationName, Method method | No description available |
| getModulesByType | String type | No description available |
| executeRecordOperation | String module, String operationName, Method method | No description available |
| getRecordUrlBuilder | String module, String id, String operationName | No description available |
| createRecords | String module, int count, Key key, Boolean isMandatory | No description available |
| checkCase | ResourceValidator resourceValidator, int status, LinkedHashMap<Property<?>, Object> dataMap, JSONPath path | No description available |
| getRecordById | String module, String id, Map<String, String> params | No description available |
| getRelatedRecords | String module, String id, String relatedModule, Map<String, String> params | No description available |
| getCustomViewFields | String cvid, DataManager dataManager, Map<String, Object> details, Key key | No description available |
| getCustomViewCriteriaPath | String module, String cvId | No description available |
| getTerritoryCriteriaPath | String territoryId | No description available |
| validateCriteria | Case c, LinkedHashMap<Property<?>, Object> response, String dataPath, String paramName | No description available |
| getMandateBodyBuilder | Operation operation | No description available |
| getBodyBuilder | Operation operation, boolean mandateOnly | No description available |
| getContent | Operation operation | No description available |
| createCasesForMatchingCriteria | String resourceName, URLBuilder urlBuilder, DataManager dataManager, String moduleName, Key key, String dataPath | No description available |
| validateInventryModule | Case c, Map<String, Object> storeDataMap, JSONPath jsonPath, String keyName | No description available |
| verifyItems | Map<String, Object> storeDataMap, Case c, String keyName, JSONPath jsonPath | No description available |
| updateRecord | String module, String recordId, JSONObject reqBody | No description available |
| orderProperties | String module, List<Property<?>> properties | No description available |
| updateOrders | String module, List<Property<?>> properties, Map<String, Integer> changeProps | No description available |
| getModules | DataManager dataManager, String cudPath, boolean isDelete, Object...args | No description available |
| deleteRecord | String module, String recordId, OAuth2 auth, boolean needToDeleteInDataManager | No description available |
| isPropertyPresent | Map<String, List<String>> map, String prop, String module | No description available |
| isPropertyPresentInSet | Map<String, Set<String>> map, String prop, String module | No description available |
| isPropertyPresentInList | List<Map<String, String>> list, String prop | No description available |
| cleanUpRecords | None | No description available |
| deleteRecordsAtParticularModule | String module, Resource recordResource, Operation deleteRecordsOperation | No description available |
| getAllRecordIdsAtParticularModule | String module, Resource recordResource, Operation getRecordsOperation, Authorization auth | No description available |

## MultiSelectRelatedListsUtil.java

    path : src/main/java/com/zoho/crm/spec/automation/custom/multiselect_relatedlist/MultiSelectRelatedListsUtil.java

| Method | Parameters | Description |
|--------|------------|-------------|
| deleteMsRelatedLists | List<String> ids, String parentModule, String caseName | No description available |
| getConnectedRelatedIds | List<String> ids, String parentModule, String content | No description available |
| createMsRelatedLists | int count, String parentModule, String connectedModule, String content | No description available |
| createMsRlUsingWrap | String module, String connectedModule | No description available |
| getRelatedListsCount | String parentModule, String type, String content | No description available |
| getRelatedListsCountByFieldEnabled | String parentModule, String type, String content, boolean fieldEnabled | No description available |
| getBody | String parentModule, String connectedModule, Integer linkingModuleVisiblity | No description available |
| getUniqueString | String name, Map<String, String> bodyMap, String api_name | No description available |
| getRelatedRecords | String module, String recordId, String type | No description available |
| loadRL | List<String> modules | No description available |

## CriteriaUtil.java

    path : src/main/java/com/zoho/crm/spec/automation/custom/util/CriteriaUtil.java

| Method | Parameters | Description |
|--------|------------|-------------|
| isTypeNeeded | None | No description available |
| setUserLookupType | UserLookupType userLookupType | No description available |
| setFieldsFilter | Predicate<Map<String, Object>> fieldsFilter | No description available |
| changeDataTypeAccordingToSupportedComparators | List<Map<String, Object>> fields, String module | No description available |
| getDataTimeValues | None | No description available |
| getpicklistValues | Map<String,Object> field | No description available |
| getPicklistPropName | None | No description available |
| getRegex | String type | No description available |
| populateMaps | None | No description available |
| getDataManager | None | No description available |

## SortUtil.java

    path : src/main/java/com/zoho/crm/spec/automation/custom/util/SortUtil.java

| Method | Parameters | Description |
|--------|------------|-------------|
| validateSort | boolean sortOrder, JSONPath path, LinkedList<Object> list, Case c, boolean isInteger | No description available |
| secondaryCheck | String source, String target | No description available |

## ResetConfigurationUtil.java

    path : src/main/java/com/zoho/crm/spec/automation/custom/util/ResetConfigurationUtil.java

| Method | Parameters | Description |
|--------|------------|-------------|
| applyResetConfiguration | String name, String... args | No description available |
| validateArgs | String name, String[] args, int expectedCount | No description available |
| getResetConfiguration | Map<String, String> params | No description available |
| getISCSignature | None | No description available |
| enableFeature | String featureName, Boolean isEnable | No description available |

## FieldsUtil.java

    path : src/main/java/com/zoho/crm/spec/automation/custom/coql/FieldsUtil.java

| Method | Parameters | Description |
|--------|------------|-------------|
| getFields | String module,int limit, String data_type | No description available |
| getRecordData | String module, String field, String data_type | No description available |
| getDataPath | String path | No description available |
| getSkipFields | None | No description available |

## ModuleUtil.java

    path : src/main/java/com/zoho/crm/spec/automation/custom/module/ModuleUtil.java

| Method | Parameters | Description |
|--------|------------|-------------|
| isCustomModule | String module | No description available |
| isLinkingModule | String module | No description available |
| isSubformModule | String module | No description available |
| getSubformParentModule | String subformModule | No description available |
| getModuleIdByAPIName | String module, Authorization auth, String domain | No description available |
| getGeneratedTypeOfModule | String module | No description available |
| fireModulesGet | String module | No description available |
| fireModulesGetAll | None | No description available |
| getModuleMeta | String module, String key | No description available |
| deleteModule | String moduleName | No description available |
| deleteCustomModules | List<String> deleteModules | No description available |
| deleteCustomModule | String moduleName, Resource modulesResource, Operation deleteModuleOperation, DataManager dataManager | No description available |
| getMandateModuleBody | String singularLabel, String pluralLabel, List<String> profileIds | No description available |
| createCustomModule | String module, Operation getModuleOperation | No description available |
| getModulesBody | String singularLabel, String pluralLabel, List<String> profileIds, Map<String, Object> otherKeys | No description available |
| getGetModuleOperation | Resource modulesResource | No description available |
| createCustomModules | Resource modulesResource, Operation getModuleOperation, Map<String, Map<String, Object>> modulesCreationMap, boolean neetToStoreModules | No description available |
| getModuleId | ResourceHandler resourceHandler , String module | No description available |

## PortalsUtil.java

    path : src/main/java/com/zoho/crm/spec/automation/custom/projects/PortalsUtil.java

| Method | Parameters | Description |
|--------|------------|-------------|
| createPortal | None | No description available |
| intercept | HttpRequest httpRequest | No description available |
| getResourceToWriteReport | None | No description available |
| getCaseDescription | None | No description available |
| getPortal | None | No description available |

## ProjectsUtil.java

    path : src/main/java/com/zoho/crm/spec/automation/custom/projects/ProjectsUtil.java

| Method | Parameters | Description |
|--------|------------|-------------|
| createProject | None | No description available |
| intercept | HttpRequest httpRequest | No description available |
| getResourceToWriteReport | None | No description available |
| getCaseDescription | None | No description available |
| getProject | None | No description available |

## ApprovalProcessCreationUtil.java

    path : src/main/java/com/zoho/crm/spec/automation/custom/approvals_actions/ApprovalProcessCreationUtil.java

| Method | Parameters | Description |
|--------|------------|-------------|
| createSequentialRejectionThreeApprovalProcess | None | No description available |
| intercept | HttpRequest httpRequest | No description available |
| getResourceToWriteReport | None | No description available |
| getCaseDescription | None | No description available |
| getApprovalDetails | URLBuilder urlBuilder, ResourceHandler handler, Operation operation, boolean b, String id | No description available |
| getRecordModification | URLBuilder urlBuilder, ResourceHandler handler, Operation operation, boolean b, String recordId | No description available |
| approvalActionsDelegateCase | URLBuilder urlBuilder, ResourceHandler handler, Operation operation, boolean b, String recordId, List<String> fieldsName, String approvalId, OAuth2 token | No description available |
| approvalActionsSubformApproveCase | URLBuilder urlBuilder, ResourceHandler handler, Operation operation, boolean b, String recordId, List<String> fieldsName, String approvalId | No description available |
| approverecordwithdataForNoFields | URLBuilder urlBuilder, ResourceHandler handler, Operation operation, boolean b, String recordId, List<String> fieldsName, String approvalId | No description available |
| approvalActionsRejectWithoutTakeOverCase | URLBuilder urlBuilder, ResourceHandler handler, Operation operation, boolean b, String recordId, List<String> fieldsName, String approvalId, boolean isStdUser | No description available |
| approvalActionsRejectCase | URLBuilder urlBuilder, ResourceHandler handler, Operation operation, boolean b, String recordId, List<String> fieldsName, String approvalId | No description available |
| approvalActionsApproveCurrentStageCase | URLBuilder urlBuilder, ResourceHandler handler, Operation operation, boolean b, String recordId, List<String> fieldsName, String approvalId | No description available |
| approvalActionsApproveWithoutTakeOverCase | URLBuilder urlBuilder, ResourceHandler handler, Operation operation, boolean b, String recordId, List<String> fieldsName, String approvalId, boolean isStdUser | No description available |
| approvalActionsApproveCase | URLBuilder urlBuilder, ResourceHandler handler, Operation operation, boolean b, String recordId, List<String> fieldsName, String approvalId | No description available |
| createParallelApprovalProcessNoFields | None | No description available |
| createSequentialApprovalProcess | None | No description available |
| createSequentialApprovalProcessWithRolesGroupsApprover | None | No description available |
| createParallelApprovalProcess | None | No description available |
| createParallelApprovalProcessWithRolesGroupsApprover | None | No description available |
| deleteApprovalProcess | boolean enable | No description available |
| createParallelApprovalProcessWithAnyoneConfig | None | No description available |
| getISCSignature | None | No description available |
| getRecord | None | No description available |
| createApprovalProcessWithoutProcessAdmin | None | No description available |
| createApprovalProcess | None | No description available |
| approvalRecord | String id, String module, JSONObject body | No description available |
| getDataPath | String path | No description available |

## SurveyUtil.java

    path : src/main/java/com/zoho/crm/spec/automation/custom/digest/SurveyUtil.java

| Method | Parameters | Description |
|--------|------------|-------------|
| getPortalConfiguration | None | No description available |
| getModule | String module | No description available |
| getModules | None | No description available |
| enableSurvey | None | No description available |
| removeModuleIntegration | String module | No description available |
| enableModuleIntegration | String module | No description available |
| disableSurvey | None | No description available |

## WizardsSectionsUtil.java

    path : src/main/java/com/zoho/crm/spec/automation/custom/wizard/WizardsSectionsUtil.java

| Method | Parameters | Description |
|--------|------------|-------------|
| updateSequenceNumber | String module, JSONObject exWizard, String caseName | No description available |
| getQueryComponentsBody | String moduleName, String fieldName, String fieldId | No description available |
| deleteFields | Set<String> fieldIds, String module | No description available |
| createFieldBody | int count | No description available |
| createWizardElementLimitBody | Set<String> fieldIds, String moduleName, String wizardName, String wizardModuleId, String layoutId, String profileId | No description available |
| createSection | String sectionName, String referenceId, Iterator<String> fieldIterator, int sequenceNumber | No description available |
| createWizardWithSubformJSON | String module, String moduleId, String layoutId, String profileId | No description available |
| createWizardJSON | String module, String caseName, String wizardModuleId, String layoutId, String profileId, String profileName | No description available |
| getProfilePath | None | No description available |
| getModuleLayoutProfileInfo | String module | No description available |
| getFields | String module | No description available |
| deleteWizard | CWrap wrap, boolean isCreate | No description available |
| createWizard | JSONObject wizardBody | No description available |
| updateWizard | JSONObject updateWizard, String wizardId | No description available |
| getWizards | String wizardId, String module | No description available |
| buildChartData | boolean isCreate, String screenId, String screenLabel | No description available |
| createSegmentBase | String displayLabel, int sequenceNumber, String type, String content, String reference_id | No description available |
| createRelatedFieldSegment | String displayLabel, int sequenceNumber, String reference_id | No description available |
| createFieldSegment | String displayLabel, int sequenceNumber, String[] fieldNames | No description available |
| createTextLabelSegment | String displayLabel, String content, int sequenceNumber | No description available |
| createButtonSegment | String displayLabel, int sequenceNumber, int customButtonSequence | No description available |
| generateUpdateWizardJson | String module, JSONObject exwizard, String queryComponentId | No description available |
| getFieldIdByDisplayLabel | String displayLabel | No description available |
| conditionalRuleJson | String module, JSONObject exWizard, String caseName | No description available |
| generateRandomReferenceId | None | No description available |
| generateLimitExceedJSON | String module, JSONObject exwizard, int segmentCount, String caseName | No description available |
| updateMutipleSegmentJson | String module, JSONObject exwizard | No description available |
| getwizardV9Body | String wizardname, String module_name, String module_id, String profile_name, String profile_id, String layout_id, String fieldId, String fieldName | No description available |

## EmailTemplatesUtil.java

    path : src/main/java/com/zoho/crm/spec/automation/custom/email_templates/EmailTemplatesUtil.java

| Method | Parameters | Description |
|--------|------------|-------------|
| checkCase | ResourceValidator resourceValidator, int status, LinkedHashMap<Property<?>, Object> dataMap, JSONPath path | No description available |

## InfoValidatorUtil.java

    path : src/main/java/com/zoho/crm/spec/automation/custom/related_records/InfoValidatorUtil.java

| Method | Parameters | Description |
|--------|------------|-------------|
| validateInfoDetails | Case c | No description available |
| intercept | HttpRequest httpRequest | No description available |

## WorkflowRulesRecordValidationsUtil.java

    path : src/main/java/com/zoho/crm/spec/automation/custom/workflows/WorkflowRulesRecordValidationsUtil.java

| Method | Parameters | Description |
|--------|------------|-------------|
| validationRecordforActionExecution | String ruleId, CWrap cwrap, APICall call | No description available |
| validateWorkflowActions | Map<String, Object> recordActionVsRecordId, String ruleId, String actionType, String module, JSONObject action | No description available |
| validateEmailAction | String module, String recordId, String ruleId | No description available |
| validateFieldUpdate | String module, String recordId, JSONObject action | No description available |
| validateTaskCreation | String module, String recordId, JSONObject action | No description available |
| validateWebhook | String ruleId | No description available |
| validateCircuits | String ruleId | No description available |
| validateRecordCreation | String module,JSONObject action | No description available |
| validateScheduleCallCreation | String module,JSONObject action | No description available |
| validateAddMeedtingCreation | String module, JSONObject action | No description available |
| validateRecordConversion | String module, JSONObject action | No description available |
| validateAddTags | String module, String recordId, JSONObject action | No description available |
| validateRemoveTags | String module, String recordId,JSONObject action | No description available |
| extractIds | JSONArray jsonArray | No description available |
| getFieldMappingasJSON | JSONObject action | No description available |
| validateFunctions | String ruleId | No description available |
| combineAllCriteria | JSONObject executeWhen, JSONArray conditions | No description available |
| handleCriteriaObject | JSONObject criteria, JSONArray combinedGroups | No description available |
| isSingleCondition | JSONObject criteria | No description available |
| buildCriteriaMatchingRecord | JSONObject record, JSONObject criteria | No description available |
| processGroups | JSONArray groups, JSONObject record | No description available |
| processCondition | JSONObject criteria, JSONObject record | No description available |
| createRecord | String module,Key key, JSONObject combinedCriteria | No description available |
| updateRecord | String module,Key key, JSONObject combinedCriteria | No description available |
| deleteRecord | String recordId, String module | No description available |
| getWorkflowUsage | String actionType, String ruleId | No description available |
| getRecord | String moduleName, String recordId | No description available |
| getRecordForMatchedValue | String moduleName, String fieldName, String fieldValue | No description available |
| getMatchedRecordId | JSONObject data, String fieldName, String fieldValue | No description available |
| getRelatedRecord | String moduleName, String recordId, String relatedModule | No description available |
| getRecordBody | URLBuilder urlbuilder, Key key, Operation operation, JSONObject combinedCriteria | No description available |

## WorkflowRulesDependentRequestUtil.java

    path : src/main/java/com/zoho/crm/spec/automation/custom/workflows/WorkflowRulesDependentRequestUtil.java

| Method | Parameters | Description |
|--------|------------|-------------|
| enableModule | String name, String status, ResourceHandler handler | No description available |
| deleteScoringRules | ResourceHandler handler | No description available |
| deleteFieldUpdates | List<String> fieldupdateIds | No description available |
| getFieldUpdates | String id | No description available |
| getTasks | String id | No description available |
| deleteWorkflowTasks | ResourceHandler handler | No description available |
| populateEmailTemplates | ResourceHandler handler | No description available |
| populateScoringRules | String module, ResourceHandler handler | No description available |
| getFields | ResourceHandler handler, String module | No description available |
| getLayouts | ResourceHandler handler, String module | No description available |
| getWorkflowConfigurations | ResourceHandler handler | No description available |
| getWorkflowRules | String ruleId | No description available |
| populateEmailNotifications | ResourceHandler handler | No description available |
| populateFieldUpdate | String module,int count | No description available |
| populateWorkflowTasks | String module | No description available |
| populateRecommendation | None | No description available |
| deleteWebhooks | ResourceHandler handler | No description available |
| deleteAssignmentRules | ResourceHandler handler | No description available |
| deleteEmailNotifications | ResourceHandler handler | No description available |
| deleteRecommendation | String id | No description available |
| deleteEmailTemplates | ResourceHandler handler | No description available |
| populateCircuits | None | No description available |
| deleteCircuits | None | No description available |
| populateGDPR | None | No description available |
| disableGDPR | None | No description available |
| populateFunction | None | No description available |
| updateFunction | None | No description available |
| deleteFunctions | None | No description available |
| populateAutomationsFunction | String module | No description available |
| deleteAllAutomationFunctions | None | No description available |
| deleteAllWorkflowRules | ResourceHandler handler | No description available |
| deleteWorkflowRules | Key key, String id, ResourceHandler resourceHandler | No description available |
| getModules | None | No description available |
| getProfile | ResourceHandler handler | No description available |
| createTeamModule | String moduleName | No description available |
| deleteTeamModule | None | No description available |

## WorkflowRulesUtil.java

    path : src/main/java/com/zoho/crm/spec/automation/custom/workflows/WorkflowRulesUtil.java

| Method | Parameters | Description |
|--------|------------|-------------|
| getStaticConditions | String module | No description available |
| deleteWorkFlowRule | List<String> ids, Authorization auth, String domain | No description available |
| getConditionWithSchedule | String module | No description available |
| getWithCriteriaConditions | String module, JSONObject criteria | No description available |
| getWithConditionsBody | String module, JSONObject criteriaDetailsJO | No description available |
| updateActionBody | String module, JSONObject actionJO, String actionType | No description available |
| getAvailablePeriod | None | No description available |
| getMinutesUnit | None | No description available |
| getActions | List<Map<String, Object>> triggers, String type | No description available |
| combinedExecuteWhenandCondition | JSONObject executeWhen, List<JSONObject> conditions, String module | No description available |
| enableModule | String name, String status, ResourceHandler handler | No description available |
| getEmailTemplatesBody | String module | No description available |
| getEmailNotificatitions | String module | No description available |
| getScoringRuleBody | String module, ResourceHandler handler | No description available |
| getRecommendationBody | None | No description available |
| createPrivacyPreferenceQuery | None | No description available |
| getCriteria | List<Map<String, Object>> fields, String groupOperator, int groupCount, String module | No description available |
| getTasksBody | String module | No description available |
| getValue | String dataType, Map<String, Object> field | No description available |
| getRegex | String type | No description available |
| handleException | Exception e | No description available |
| createWorkflowRules | JSONObject body,String module | No description available |
| getDynamicFieldBody | String expression, String return_type,String fieldName | No description available |

## ShiftHoursUtil.java

    path : src/main/java/com/zoho/crm/spec/automation/custom/shifthours/ShiftHoursUtil.java

| Method | Parameters | Description |
|--------|------------|-------------|
| createShiftHours | String domain, Authorization auth, JSONObject shiftHourBody | No description available |
| deleteShiftHour | String shiftId, String domain, Authorization auth | No description available |

## UsersUtil.java

    path : src/main/java/com/zoho/crm/spec/automation/custom/user/UsersUtil.java

| Method | Parameters | Description |
|--------|------------|-------------|
| getPrimaryUser | Authorization auth, String domain | No description available |
| getPrimaryUserEmail | None | No description available |
| getUserEmailBasedOnType | String type, Authorization auth, String domain | No description available |
| getUserIdsByType | String type | No description available |
| checkCase | ResourceValidator resourceValidator, int status, LinkedHashMap<Property<?>, Object> dataMap, JSONPath path | No description available |
| createUser | String type | No description available |
| disableUser | String id, Key key | No description available |
| deleteUser | String id, Key key | No description available |
| changeUserProfile | String userID, String profileName | No description available |

## SandboxUsersUtil.java

    path : src/main/java/com/zoho/crm/spec/automation/custom/user/SandboxUsersUtil.java

| Method | Parameters | Description |
|--------|------------|-------------|
| createSandboxDeveloperUser | String type, Integer count, String profile | No description available |
| increaseUserAdditionLimit | String actionType, Integer count | No description available |
| deleteSandboxById | String sandboxId, OAuth2 productionUser, Case c | No description available |
| fetchSandboxDetails | String url | No description available |
| getSandboxDetails | None | No description available |
| deleteSandbox | JSONArray sandboxIdArr, Case c | No description available |
| CreateAndGetSandbox | Url url, URLBuilder urlBuilder, Key key | No description available |
| createUserWithtype | String type, String userType, String profile | No description available |
| checkCase | ResourceValidator resourceValidator, int status, LinkedHashMap<Property<?>, Object> dataMap, JSONPath path | No description available |

## CanvasViewUtil.java

    path : src/main/java/com/zoho/crm/spec/automation/custom/canvas_views/CanvasViewUtil.java

| Method | Parameters | Description |
|--------|------------|-------------|
| createCanvasView | JSONObject body,String module,OAuth2 auth,String domain | No description available |
| updateCanvasViewById | JSONObject body, String module, String id, OAuth2 auth,String domain | No description available |
| getCanvasView | String module, String id,OAuth2 auth,String domain | No description available |
| deleteCanvasViewById |  String module, String id, OAuth2 auth,String domain | No description available |
| getVersion | None | No description available |
| setVersion | String ver | No description available |

## FileSizeFieldIncreaseUtil.java

    path : src/main/java/com/zoho/crm/spec/automation/custom/field/FileSizeFieldIncreaseUtil.java

| Method | Parameters | Description |
|--------|------------|-------------|
| createField | String module, String datatype, String fieldLabel | No description available |
| getImageorFileUploadFieldObject | String datatype, String fieldLabel | No description available |
| getResetConfiguration | Map<String, String> params, JSONObject body | No description available |
| deleteAllFields | String module | No description available |
| getISCSignature | None | No description available |

## FieldsCommonUtil.java

    path : src/main/java/com/zoho/crm/spec/automation/custom/field/FieldsCommonUtil.java

| Method | Parameters | Description |
|--------|------------|-------------|
| setVersion | String version | No description available |
| getPicklistValueApiName | None | No description available |
| getUnsupportedFields | None | No description available |
| getCreateFieldHook | LinkedHashMap<Property<?>, Object> body, Content content, String module, OAuth2 auth, String domain | No description available |
| getFieldsBodyByDataType | String datatype, String fieldName | No description available |
| getCreateFieldsHook | JSONObject body, String module, OAuth2 auth | No description available |
| bulkCreateFieldHook | JSONObject body, String module, OAuth2 auth | No description available |
| getUpdateFieldHook | LinkedHashMap<Property<?>, Object> body, String module, String id, OAuth2 auth | No description available |
| updateField | JSONObject body, String module, String id, OAuth2 auth, String domain | No description available |
| getFieldHook | String module, String id, OAuth2 auth, String domain, String key | No description available |
| getFieldValueByKey | String module, String inputKey, String inputValue, String returnKey | No description available |
| deleteFieldHook | String module, String fieldId, OAuth2 auth | No description available |
| deleteHook | String module, String fieldId, OAuth2 auth, String domain | No description available |
| setdeletion | CWrap wrap, String fieldId, String module | No description available |
| accept | APICall call | No description available |
| deleteField | String fieldId, String module | No description available |
| enablePickListFieldTracker | String module, String pickListFieldId, int followingFieldsCount, String followingFieldsIdentifier | No description available |
| getPicklistFieldTrackerPostBody | String module | No description available |
| createPickListField | String module | No description available |
| getPickListFieldBody | JSONObject body, String fieldName | No description available |
| disablePickListFieldTracker | String module, String picklistId | No description available |
| executeCallWrap | String module, JSONObject body, Method method | No description available |
| loadField | List<String> modules | No description available |
| getFieldsBuilder | None | No description available |
| displayFieldInReport | String module, String id, String description | No description available |
| executeCall | String module, JSONObject body, String method | No description available |
| getUniqueName | String name | No description available |
| getPicklistFieldTrackerBody | String module | No description available |
| getVal | String module, String apiName | No description available |
| createField | int n, String module, String type, List<String> fieldName | No description available |
| pushFieldsToReport | String module, String caseDescription | No description available |
| createEncryptField | String module, String type, String identifier | No description available |
| enableOrDisableVisitsModule | ResourceHandler handler, Method method | No description available |
| createCustomFields | String module, boolean needToStoreFields, Resource fieldsResource, Operation getFieldsOperation | No description available |
| getFieldBody | String module, String apiName, String dataType, Map<String, Object> otherKeys | No description available |
| createFieldsAndGetId | String module, JSONObject fieldsBody | No description available |
| createFieldHook | String module, JSONObject fieldsBody | No description available |
| getField | String apiName, String dataType, Map<String, Object> otherKeys, List<Map<String, Object>> existingFields, String module | No description available |
| deleteCustomFields | Map<String, List<String>> modulesAndcustomFieldsMap | No description available |
| deleteCustomFieldsOnAModule | String module, List<String> fields, Resource fieldsResource, Operation deleteFieldsOperation, ExecutorService executor | No description available |
| deleteCustomField | String fieldId, String module | No description available |
| getFieldsMeta | String module, String apiName, String key | No description available |
| pushReport | String module, String type, String content | No description available |
| getMsLookupBody | String connectedModule, String moduleLookupField, String connectedModuleLookupField | No description available |
| getSpecificFieldDataType | String module, String dataType | No description available |
| getFieldsUrl | None | No description available |
| deleteAllCustomFields | ResourceHandler handler | No description available |
| getFields | String module | No description available |
| createLookupField | String name, String lookupModule, Integer length, String displayLabel | No description available |
| createFieldBody | String name, String dataType, Integer length | No description available |

## FieldsmxnCaseUtil.java

    path : src/main/java/com/zoho/crm/spec/automation/custom/field/FieldsmxnCaseUtil.java

| Method | Parameters | Description |
|--------|------------|-------------|
| getModules | None | No description available |
| getDatatypes | None | No description available |
| createFields | LinkedHashMap<Property<?>, Object> body, Content content, String module, OAuth2 authToken | No description available |
| delField | String id, String module, OAuth2 authToken | No description available |
| deleteFields | String id, String module, Operation operation, String domain | No description available |
| Updateprofile | String id, JSONObject body | No description available |
| intercept | HttpRequest httpRequest | No description available |
| buildCase | Url url, URLBuilder urlBuilder, List<LinkedHashMap<Argument, Object>> arguments, LinkedHashMap<Property<?>, Object> body, Operation operation, Content content, String caseidentifier, String caseName, String caseDescription, boolean isError, String errorCode, int statusCode, Key key, String module, String dataType, OAuth2 auth, GroupHandler groupHandler | No description available |
| checkCase | ResourceValidator resourceValidator, int status, LinkedHashMap<Property<?>, Object> dataMap, JSONPath path | No description available |
| getProfileRequestBody | String profileId, Boolean isenable, List<String> permissionNames | No description available |
| getProfileId | None | No description available |
| createLayoutClone | String module, String layoutName | No description available |
| deleteLayouts | String layoutId,String module | No description available |
| getDataPath | String path | No description available |

## FieldsLimitExceedCaseUtil.java

    path : src/main/java/com/zoho/crm/spec/automation/custom/field/FieldsLimitExceedCaseUtil.java

| Method | Parameters | Description |
|--------|------------|-------------|
| generateLimitExceedCase | None | No description available |
| buildAndExecuteLimitExceedCase | String module,List<Case> cases | No description available |
| accept | APICall call | No description available |
| getCountOfExtraFieldsToBeCreated | String module | No description available |
| createFields | String module,Integer count | No description available |
| generateRequestBodies | Integer count | No description available |
| generateRequestBody | Integer count | No description available |
| generateCWrapRequestBody | None | No description available |
| deleteCreatedFields | String module | No description available |
| deleteFieldIds | List<String> ids, String module | No description available |

## DynamicFieldsUtil.java

    path : src/main/java/com/zoho/crm/spec/automation/custom/field/DynamicFieldsUtil.java

| Method | Parameters | Description |
|--------|------------|-------------|
| setVersion | String version | No description available |
| getModules | None | No description available |
| getUser | None | No description available |
| getCreateFieldHook | JSONObject body, String module, OAuth2 auth | No description available |
| getUpdateFieldHook | JSONObject body, String module, String id, OAuth2 auth | No description available |
| deleteField | String module, String id, OAuth2 auth | No description available |
| deleteFieldHook | String module, String fieldId,OAuth2 auth | No description available |
| setdeletion | CWrap wrap, String fieldId, String module | No description available |
| accept | APICall call | No description available |
| getFieldIds | String identifier, List<Object> fieldLabels,String module | No description available |
| deleteAllFields | OAuth2 auth | No description available |
| deleteReports | String reportName | No description available |
| enableFeature | String featureName,Boolean isEnable | No description available |

## RecordsSearchUtil.java

    path : src/main/java/com/zoho/crm/spec/automation/custom/records_search/RecordsSearchUtil.java

| Method | Parameters | Description |
|--------|------------|-------------|
| getCriteriaValues | Map<String,List<Map<String,Object>>> datatypeVsfield, Map<String,List<Map<String,Object>>> encdatatypeVsfield,List<Map<String,Object>> specialField, Map<String,Map<String,Object>> apinameVsfield, Map<String, Object> record, boolean singleCriteria | No description available |
| getRandomValues | String data_type, List<Object> values | No description available |
| convertValues | String type, String comp, String api_name, List<Object> values | No description available |
| convertLongValue | String comp, String api_name, String longV | No description available |
| convertStringValue | String comp, String api_name, String strList | No description available |
| convertBooleanValue | String comp, String api_name, Boolean booleanVal | No description available |
| convertDoubleValue | String comp, String api_name, Object doubl | No description available |
| convertIntegerValue | String comp, String api_name, String integ | No description available |
| convertDateValue | String comp, String api_name, String dateVal | No description available |
| convertDateTimeValue | String comp, String api_name, String dateTimeVal | No description available |
| getProcessedString | String unprocess | No description available |

## TimelinesCommonUtil.java

    path : src/main/java/com/zoho/crm/spec/automation/custom/timelines/TimelinesCommonUtil.java

| Method | Parameters | Description |
|--------|------------|-------------|
| CreatePicklistField | String module, String fieldLabel, String[] options | No description available |
| getPickListObject | String fieldLabel, String[] options | No description available |

## WorkflowRuleUtil.java

    path : src/main/java/com/zoho/crm/spec/automation/custom/timelines/WorkflowRuleUtil.java

| Method | Parameters | Description |
|--------|------------|-------------|
| createWorkFlowRule | String module, String emailNotificationId, Authorization auth, String domain | No description available |
| deleteWorkFlowRule | List<String> ids, Authorization auth, String domain | No description available |
| getWorkFlowRuleBody | String moduleName, String moduleId, String emailNotificationId | No description available |

## CompositeUtil.java

    path : src/main/java/com/zoho/crm/spec/automation/custom/composite/CompositeUtil.java

| Method | Parameters | Description |
|--------|------------|-------------|
| getAllResources | None | No description available |
| getInstance | Automation automation, Case c | No description available |
| addCase | Case c | No description available |
| getCase | Number key | No description available |
| generateSubCases | None | No description available |
| getRequestBuilder | Case c | No description available |
| getSubCase | None | No description available |
| getListGetCase | None | No description available |

## UsersTransferUtil.java

    path : src/main/java/com/zoho/crm/spec/automation/custom/users_transfer/UsersTransferUtil.java

| Method | Parameters | Description |
|--------|------------|-------------|
| getUserBody | None | No description available |
| createUser | JSONObject body | No description available |
| deleteUser | String id | No description available |
| getDataPath | String path | No description available |

## GetRelatedRecordsCountUtil.java

    path : src/main/java/com/zoho/crm/spec/automation/custom/get_related_records_count/GetRelatedRecordsCountUtil.java

| Method | Parameters | Description |
|--------|------------|-------------|
| associateRecord | Case c | No description available |
| createRelatedRecord | String relatedListName, String module, String recordId, JSONObject requestBody, boolean converted, boolean approved, Case c | No description available |
| associateReportingContacts | String relatedModule, String module, String recordId | No description available |
| linkAccountAndContact | String contactId, String accountId | No description available |
| associateStageHistory | String relatedModule, String module, String recordId | No description available |
| associateInvitees | String relatedModule, String module, String recordId | No description available |
| associateSystemRL | String relatedModule, String module, String recordId, String relatedListName, String relatedFieldName, JSONObject requestBody, boolean converted, boolean approved | No description available |
| associateChildCampaigns | String relatedModule, String module, String recordId | No description available |
| associateChildAccounts | String relatedModule, String module, String recordId | No description available |
| associateTasksAndTasksHistory | String relatedModule, String module, String recordId | No description available |
| associateEventsAndEventsHistory | String relatedModule, String module, String recordId | No description available |
| associateCallsAndCallsHistory | String relatedModule, String module, String recordId | No description available |
| associateNotes | String relatedModule, String module, String recordId | No description available |
| getRecord | String relatedModuleName, String id | No description available |
| convertRecord | String relatedModuleName, String id | No description available |
| updateRecordUnderApprovalProcedd | String relatedModuleName, String id | No description available |
| getFields | String relatedModuleName | No description available |

## CadencesBodyUtil.java

    path : src/main/java/com/zoho/crm/spec/automation/custom/cadences_execution/CadencesBodyUtil.java

| Method | Parameters | Description |
|--------|------------|-------------|
| cadenceBody | String module, String cadenceName | No description available |
| taskAllActionCadenceBody | String module, String cadenceName | No description available |
| emailAllActionCadenceBody | String module, String cadenceName | No description available |
| callAllActionCadenceBody | String module, String cadenceName | No description available |
| combinationCadenceBody | String module, String cadenceName, String subjectName | No description available |
| automaticTaskAllActionCadenceBody | String module, String cadenceName, String customViewId | No description available |
| automaticEmailAllActionCadenceBody | String module, String cadenceName, String customViewId | No description available |
| automaticCallAllActionCadenceBody | String module, String cadenceName, String customViewId | No description available |
| createTemplates | String moduleName, String subject | No description available |
| getCustomViewId | String module | No description available |
| callCadenceBody | String module, String cadenceName | No description available |
| cadenceWithoutFollowup | String module, String cadenceName | No description available |
| emailSimpleCadenceBody | String module, String cadenceName, String subject | No description available |
| callSimpleCadenceBody | String module, String cadenceName | No description available |
| createCommonCallCadence | String name, String module | No description available |
| createCustomViewBody | String fieldName | No description available |
| addIdToList | String id | No description available |

## CadencesUtil.java

    path : src/main/java/com/zoho/crm/spec/automation/custom/cadences_execution/CadencesUtil.java

| Method | Parameters | Description |
|--------|------------|-------------|
| createCadence | JSONObject body, OAuth2 auth, String domain | No description available |
| deleteCadence | String id, OAuth2 auth, String domain | No description available |
| unenrollRecord | JSONObject requestBody, String module, OAuth2 auth, String domain | No description available |
| enrollRecord | JSONObject requestBody, String module, OAuth2 auth, String domain | No description available |
| publishCadence | String id, OAuth2 auth, String domain | No description available |
| activateCadence | String id, OAuth2 auth, String domain | No description available |
| getDataPath | String path | No description available |
| addId | String id | No description available |

## PortalsUtil.java

    path : src/main/java/com/zoho/crm/spec/automation/custom/portals/PortalsUtil.java

| Method | Parameters | Description |
|--------|------------|-------------|
| updateSAMLConfiguration | String mandateKey, String portalName, Key key, URLBuilder urlBuilder, BodyBuilder bodyBuilder, String caseDescription, Integer statusCode, boolean disableSAMLConfiguration | No description available |
| checkCase | ResourceValidator resourceValidator, int status, LinkedHashMap<Property<?>, Object> dataMap, JSONPath path | No description available |
| deletePortalCase | String portalName, Key key, BodyBuilder bodyBuilder, String caseDescription, Integer statusCode | No description available |
| deletePortalForm | String portalId, String version | No description available |
| createPortalForm | String emailId, String userId, boolean activeState, String version, List<String> portalformIds, boolean includeFormSections | No description available |
| getUserTypeID | String portalName, String version | No description available |
| getSAMLConfiguration | String portalName, Authorization authorization, Domain domain, String version | No description available |
| setUserTypeId | Case _case,String portalName, String resource, String version | No description available |
| updateUserTypesWithField | Authorization authorization, Domain domain, String version, String portalName, String fieldId, String userTypeId, Key key, Resource resource1, boolean isActive | No description available |
| intercept | HttpRequest httpRequest | No description available |
| getResourceToWriteReport | None | No description available |
| getCaseDescription | None | No description available |
| getFieldId | JSONArray fieldsArray, String columnName | No description available |
| getFieldIdbyColumnName | Authorization authorization, Domain domain, String version | No description available |
| createPortalCase | String portalName, Key key, BodyBuilder bodyBuilder, String caseDescription, Integer statusCode, boolean portalNullCase | No description available |

## BulkReadUtil.java

    path : src/main/java/com/zoho/crm/spec/automation/custom/bulk_read/BulkReadUtil.java

| Method | Parameters | Description |
|--------|------------|-------------|
| getDefaultNotSupportedModules | None | No description available |
| getSupportedModules | None | No description available |
| getCriteriaMap | HashMap<String, String> criFields, String module, int length | No description available |
| getHiddenModules | boolean checkProfilePermission, boolean isAboveV5 | No description available |
| addCases | LinkedHashMap<Property<?>, Object> body ,URLBuilder _urlBuilder, ArrayList<Case> cases, String serviceHeader, String caseName, String description, int status, PostHookWrap postHook | No description available |
| executeCase | URLBuilder urlBuilder1, LinkedHashMap<Property<?>, Object> body, Resource resource, String caseName, String description | No description available |
| getBodyBuilder | Operation operation | No description available |
| getPicklistValueApiName | DataManager dataManager | No description available |
| getComparator | ArrayList<String> types, String caseName, String field | No description available |
| execute | Case c, String url, Method method, String jobId, int minLength, String name, String resourceName, String auth | No description available |
| intercept | HttpRequest httpRequest | No description available |
| getResourceToWriteReport | None | No description available |
| getCaseDescription | None | No description available |
| getResource | None | No description available |
| setGroupHandler | String jobId | No description available |
| getDetails | String path | No description available |
| getContent | Operation operation | No description available |

## VOCDataUtil.java

    path : src/main/java/com/zoho/crm/spec/automation/custom/voc/util/VOCDataUtil.java

| Method | Parameters | Description |
|--------|------------|-------------|
| doDIVOCEmailInsert | DataManager dataManager | No description available |
| intercept | HttpRequest httpRequest | No description available |
| getResourceToWriteReport | None | No description available |
| getCaseDescription | None | No description available |
| sendSurvey | DataManager dataManager | No description available |
| getContent | Key lockerKey, DataManager dataManager | No description available |
| getContactKey | DataManager dataManager | No description available |
| getDataPath | String path | No description available |

## VOCForecastsUtil.java

    path : src/main/java/com/zoho/crm/spec/automation/custom/voc/VOCForecastsUtil.java

| Method | Parameters | Description |
|--------|------------|-------------|
| getFieldIds | String identifier, List<String> fieldLabels, String module | No description available |
| checkVocEnabled | None | No description available |
| enableVocConfiguration | None | No description available |
| addSourceSettings | HashMap<String, Object> dataHM | No description available |
| getSourceSettingsBody | String moduleConfigID, String noteContentId, String parentId, String createdTmId | No description available |
| getModuleConfiguratorId | HashMap<String, Object> dataHM | No description available |
| createForeCastConfiguration | None | No description available |
| getForeCastConfiguration | String forecastType | No description available |
| getForeCastConfigDetails | None | No description available |
| getForecastConfigJsonBody | String modelId, String hierarchyId | No description available |
| createForeCast | None | No description available |
| getForeCast | None | No description available |
| getForeCastBody | None | No description available |
| createAnalyticForVOC | HashMap<String, Object> dataHM | No description available |
| getAnalyticBody | String forecastID, String vocConfigId | No description available |
| getBucket | String label, String value, String stageVar | No description available |
| getFilters | None | No description available |
| buildComponentJson | None | No description available |
| deleteAnalyticForVOC | String dashboardId | No description available |
| getTriggerComputationBody | String forecastId, String vocConfigId | No description available |
| createTriggerComputation | String dashboardId, String foreCastId, String vocId | No description available |
| updateTriggerComputation | String dashboardId | No description available |
| getCurrentMonthFiscalId | None | No description available |
| getCurrentMonthAndYear | None | No description available |
| createDeal | String contactId, String accountId | No description available |
| getDealJsonBody | String contactId, String accountRecordId | No description available |
| getCurrentDateFormatted | None | No description available |
| updateDeal | String dealId, String stage | No description available |
| deleteRecords |  Map<String, List<String>> recordsList | No description available |
| getForecastAnalyticsDashboardId | None | No description available |
| getAnalyticsComponentId | String dashboardId | No description available |
| getAnalyticsComponentData | String dashboardId | No description available |
| getUpdateDealJsonBody | String stage | No description available |
| getNoteJSONBody | String parent_id, String module, String noteContent | No description available |
| AssociateNote | String module, String recordId, String noteContent | No description available |
| createRecord | int recordCnt, String module | No description available |

## SandboxUtil.java

    path : src/main/java/com/zoho/crm/spec/automation/custom/sandbox/SandboxUtil.java

| Method | Parameters | Description |
|--------|------------|-------------|
| deployChanges | String sandboxId, List<String> changeIds, String domain, Authorization auth | No description available |
| createSandbox | String prodDomain, String sandboxName, OAuth2 prodAuth | No description available |
| createSandboxAndSkipTemplates | String prodDomain,String sandboxName, OAuth2 prodAuth | No description available |
| checkSandboxasActive | Case currentCase, String prodDomain, String sandboxName, OAuth2 prodAuth | No description available |
| deleteSandbox | String sandBoxId, OAuth2 prodAuth | No description available |
| rebuildChanges | String sandboxId | No description available |
| validateChanges | String sandboxId, List<String> changeIds, String domain, Authorization auth | No description available |
| createField | String module, String fieldName, String dataType, Authorization authorization, String domain | No description available |
| executeCall | String module, Authorization authorization, String domain, JSONObject body | No description available |
| getFieldsBody | String fieldName, String dataType, String parentModule, String childModule | No description available |
| getSandboxBody | String source, List<String> modulesList, String userId, String recordCount, String type, String sandboxName | No description available |
| getOnlyChangeIds | String sandboxId, String domain, Authorization auth | No description available |
| createLookupField | String lookupName, String rLName, String parentModule, String childModule, Authorization auth, String domain | No description available |
| validateFieldPresence | Case rCase, String domain, Authorization auth, String env, Map<String, List<String>> details | No description available |
| validateRelatedListsPresence | Case rCase, String domain, OAuth2 auth, String env, Map<String, List<String>> details | No description available |
| validateFieldValue | Case rCase, String domain, Authorization auth, String env, Map<String, Map<String, Map<String, Object>>> details | No description available |
| validateRelatedListsValue | Case rCase, String domain, OAuth2 auth, String env, Map<String, Map<String, Map<String, Object>>> details | No description available |
| validateValue | Object reqVal, Object resVal, Case rCase, String fieldPath | No description available |
| getSandBoxAuth | OAuth2 productionAuth, String prodDomain, String orgId | No description available |
| getUserId | String type, String type__s, OAuth2 prodAuth | No description available |
| getSandboxBodySkipTemplates | String source, List<String> modulesList, String userId, String recordCount, String type, String sandboxName | No description available |
| createSubMenu | String apiName, String key | No description available |
| getUniqueName | String name | No description available |
| getPreHandle | URLBuilder urlBuilder, String domain, OAuth2 auth, boolean enableNewFlow | No description available |
| getPostHandle | URLBuilder urlBuilder, OAuth2 auth | No description available |
| getSandboxAuthAsTicket | IAMTicket iamTicket, String sandboxOrgId | No description available |

## GraphQLUtil.java

    path : src/main/java/com/zoho/crm/spec/automation/custom/graphql/GraphQLUtil.java

| Method | Parameters | Description |
|--------|------------|-------------|
| getSchema | String domain, Authorization authorization, String introspectionQuery | No description available |
| intercept | HttpRequest httpRequest | No description available |
| getResourceToWriteReport | None | No description available |
| getCaseDescription | None | No description available |

## FilesUtil.java

    path : src/main/java/com/zoho/crm/spec/automation/custom/files/FilesUtil.java

| Method | Parameters | Description |
|--------|------------|-------------|
| getPrimaryFileIdSupplier | None | No description available |
| loadFilesAndImages | File[] files | No description available |
| loadFiles | None | No description available |
| getPrimaryImageIdSupplier | None | No description available |
| getPrimaryLargeImageIdSupplier | None | No description available |
| getFileId | None | No description available |
| getImageId | None | No description available |
| getFilesPath | None | No description available |
| getLargeImageId | None | No description available |
| getFileIdSupplier | None | No description available |
| getImageIdSupplier | None | No description available |
| getLargeImageIdSupplier | None | No description available |

## ProfilesUtil.java

    path : src/main/java/com/zoho/crm/spec/automation/custom/profiles/ProfilesUtil.java

| Method | Parameters | Description |
|--------|------------|-------------|
| getProfileIdByName | String name | No description available |
| cloneProfileAndGetId | String cloneProfileName, String profileName | No description available |
| deleteProfile | String id, String transfer_to,boolean isRemove | No description available |

## WebhooksUtil.java

    path : src/main/java/com/zoho/crm/spec/automation/custom/webhooks/util/WebhooksUtil.java

| Method | Parameters | Description |
|--------|------------|-------------|
| createWebhook | String module | No description available |
| deleteWebhook | String id | No description available |

## BulkWriteUtil.java

    path : src/main/java/com/zoho/crm/spec/automation/custom/bulkwrite/BulkWriteUtil.java

| Method | Parameters | Description |
|--------|------------|-------------|
| doGetWriter | String csv, String method, String module, Charset charset | No description available |
| getDetails | String path, DataManager dataManager | No description available |
| processResource | DataManager dataManager, String module, String method, String char_encode, HashMap<Property<?>, Object> map, ArrayList<String> subresource, ArrayList<Object> recordsarr | No description available |
| processSubformResource | DataManager dataManager, Optional<HashMap<String, Object>> subform, String method, Charset charset, LinkedHashMap<Property<?>, Object> singleResource, ArrayList<LinkedHashMap<Property<?>, Object>> resourceObj, ArrayList<String> csvs, HashMap<String, Object> parentIndexes | No description available |
| processMSLResource | DataManager dataManager, Optional<HashMap<String, Object>> msl, String method, Charset charset, LinkedHashMap<Property<?>, Object> singleResource, ArrayList<LinkedHashMap<Property<?>, Object>> resourceObj, ArrayList<String> csvs, HashMap<String, Object> parentIndexes | No description available |
| doWriteSubformCSVFile | String fileStore, String csv, String module, String method, Charset charset, ArrayList<HashMap<String, Object>> moduleFields, ArrayList<Object> records, LinkedHashMap<Property<?>, Object> clonedResource, HashMap<String, Object> parentIndexes, ArrayList<String> recordIds | No description available |
| doWriteMSLCSVFile | String fileStore, String csv, String module, String method, Charset charset, List<HashMap<String, Object>> moduleFields, ArrayList<Object> records, LinkedHashMap<Property<?>, Object> clonedResource, String parentapiname, HashMap<String, Object> parentIndexes, ArrayList<String> recordIds | No description available |
| populateParentCSV | CSVWriter writer, ArrayList<HashMap<String, Object>> moduleFields, HashMap<String, String> apinameVsHeader, HashMap<String, HashMap<String, Object>> apinameVsField, ArrayList<Object> list, String method, String module, ArrayList<String> recordIds | No description available |
| populateSubformCSV | CSVWriter writer, List<HashMap<String, Object>> moduleFields, HashMap<String, String> apinameVsHeader, HashMap<String, HashMap<String, Object>> apinameVsField, ArrayList<Object> list, String method, String module, String lookupColumn, ArrayList<String> indexValues, ArrayList<String> recordIds | No description available |
| processAndGetValues | Entry<String, String> field, LinkedHashMap<String, Object> record, ArrayList<String> values, HashMap<String, HashMap<String, Object>> apinameVsField | No description available |
| doSkipProcess | String api_name, String module, String data_type | No description available |
| getRecordsBody | DataManager dataManager, String method, String module | No description available |
| getBody | BodyBuilder bodyBuilder, URLBuilder urlBuilder, Resource resource, String method, String module | No description available |
| getSuccessBody | BodyBuilder bodyBuilder, URLBuilder urlBuilder, Resource resource | No description available |
| getContent | Operation operation | No description available |
| uploadRequest | DataManager dataManager, String fileStore, ArrayList<String> csvs, String method, String module | No description available |
| compressFile | String fileStore, String zip, ArrayList<String> csv | No description available |
| setRecordsCount | String module, int count  | No description available |
| getRecordsCount | String module  | No description available |

## PagesUtil.java

    path : src/main/java/com/zoho/crm/spec/automation/custom/pages/PagesUtil.java

| Method | Parameters | Description |
|--------|------------|-------------|
| getPage | Map<String,String>map,String description | No description available |
| getPagebyId | Map<String,String>map,String description,String pageid | No description available |

## ZiaOrgEnrichmentUtil.java

    path : src/main/java/com/zoho/crm/spec/automation/custom/zia_org_enrichment/ZiaOrgEnrichmentUtil.java

| Method | Parameters | Description |
|--------|------------|-------------|
| createEnrich | LinkedHashMap<Property<?>, Object> body, Content content | No description available |
| UpdateEnrich | String configId,LinkedHashMap<Property<?>, Object> body, Content content | No description available |
| createorgEnrich | JSONObject body, Content content,String module | No description available |
| createPeopleEnrich | LinkedHashMap<Property<?>, Object> body, Content content,String module | No description available |
| deleteEnrich | List<String> ids | No description available |
| getEnrich | None | No description available |
| peopleExtension | String action | No description available |

## SharingRulesUtil.java

    path : src/main/java/com/zoho/crm/spec/automation/custom/sharingrules/SharingRulesUtil.java

| Method | Parameters | Description |
|--------|------------|-------------|
| createSharingRule | JSONObject body,String module,OAuth2 auth,String domain | No description available |
| updateRuleById | JSONObject body, String module, String id, OAuth2 auth,String domain | No description available |
| updateRules | JSONObject body, String module, OAuth2 auth,String domain | No description available |
| activateRule | String module, String id, OAuth2 auth,String domain | No description available |
| deactivateRule | String module, String id, OAuth2 auth,String domain | No description available |
| deleteRuleById |  String module, String id, OAuth2 auth,String domain | No description available |
| getVersion | None | No description available |
| setVersion | String ver | No description available |

## EmailSignatureUtil.java

    path : src/main/java/com/zoho/crm/spec/automation/custom/email_signature/EmailSignatureUtil.java

| Method | Parameters | Description |
|--------|------------|-------------|
| createSignatureId | int n, Case parentCase, ResourceHandler resourceHandler, String userId, String name | No description available |
| getBody | None | No description available |
| getEmail | OAuth2 auth | No description available |
| getDataPath | String path, ResourceHandler resourceHandler | No description available |
| deleteEmailSignature | String id, ResourceHandler resourceHandler, Case parentCase, OAuth2 auth | No description available |
| getSignatureId | RequestBuilder requestBuilder, ResourceHandler resourceHandler, String userID | No description available |
| enableOrDisableImapConfig | boolean status, Method method | No description available |
| updateCode | String orgEmailId, String code | No description available |
| createOrgEmail | List<String> profileIds, String email | No description available |
| deleteOrgEmail | String email, String transferToId, ResourceHandler resourceHandler | No description available |
| getEmailBody | List<String> profileIds, String email | No description available |
| getProfiles | None | No description available |
| getComposeApi | String caseDescription | No description available |
| getOtherAuth | String userId | No description available |
| getUser | OAuth2 auth | No description available |
| deleteSignIfEmailIsMapped | String emailr, OAuth2 auth, ResourceHandler resourceHandler | No description available |
| loadFromAddress | ResourceHandler handler | No description available |

## ZDKRequestUtil.java

    path : src/main/java/com/zoho/crm/spec/automation/custom/zdk/ZDKRequestUtil.java

| Method | Parameters | Description |
|--------|------------|-------------|
| deleteModule | String id | No description available |
| createModule | String name | No description available |
| deleteField | String id, String module | No description available |
| createField | String name, String module | No description available |
| deleteProfile | String id | No description available |
| createProfile | String name | No description available |
| deleteRole | String id | No description available |
| createRole | String name | No description available |
| deleteWidget | String id | No description available |
| createWidget | String name | No description available |
| deleteLayout | String id | No description available |
| createLayout | String name | No description available |

## ZDKZipUtil.java

    path : src/main/java/com/zoho/crm/spec/automation/custom/zdk/ZDKZipUtil.java

| Method | Parameters | Description |
|--------|------------|-------------|
| createZip | String filePath, String zipFolderName, String zipFileName, JSONObject body | No description available |
| checkIsSchedulerCompleted | String jobId | No description available |
| getPushResult | String jobId | No description available |
| checkIstheFilePresent | String string | No description available |


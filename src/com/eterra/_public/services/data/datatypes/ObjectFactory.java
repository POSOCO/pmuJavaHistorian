
package com.eterra._public.services.data.datatypes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.eterra._public.services.data.datatypes package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ConfigurationRequest_QNAME = new QName("http://www.eterra.com/public/services/data/dataTypes", "ConfigurationRequest");
    private final static QName _DataElementSettingsRequest_QNAME = new QName("http://www.eterra.com/public/services/data/dataTypes", "DataElementSettingsRequest");
    private final static QName _ModeSettingsRequest_QNAME = new QName("http://www.eterra.com/public/services/data/dataTypes", "ModeSettingsRequest");
    private final static QName _MappingsRequest_QNAME = new QName("http://www.eterra.com/public/services/data/dataTypes", "MappingsRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.eterra._public.services.data.datatypes
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PdxModeFilteredDataRequest }
     * 
     */
    public PdxModeFilteredDataRequest createPdxModeFilteredDataRequest() {
        return new PdxModeFilteredDataRequest();
    }

    /**
     * Create an instance of {@link TimeRangeElement }
     * 
     */
    public TimeRangeElement createTimeRangeElement() {
        return new TimeRangeElement();
    }

    /**
     * Create an instance of {@link PdxIdList }
     * 
     */
    public PdxIdList createPdxIdList() {
        return new PdxIdList();
    }

    /**
     * Create an instance of {@link PdxDataAndEventsRequest }
     * 
     */
    public PdxDataAndEventsRequest createPdxDataAndEventsRequest() {
        return new PdxDataAndEventsRequest();
    }

    /**
     * Create an instance of {@link ConfigurationResponse }
     * 
     */
    public ConfigurationResponse createConfigurationResponse() {
        return new ConfigurationResponse();
    }

    /**
     * Create an instance of {@link ConfigurationResponseElement }
     * 
     */
    public ConfigurationResponseElement createConfigurationResponseElement() {
        return new ConfigurationResponseElement();
    }

    /**
     * Create an instance of {@link InternalServerFaultDetail }
     * 
     */
    public InternalServerFaultDetail createInternalServerFaultDetail() {
        return new InternalServerFaultDetail();
    }

    /**
     * Create an instance of {@link MeasurementBasedEventsRequest }
     * 
     */
    public MeasurementBasedEventsRequest createMeasurementBasedEventsRequest() {
        return new MeasurementBasedEventsRequest();
    }

    /**
     * Create an instance of {@link PdxModeCentricDataRequest }
     * 
     */
    public PdxModeCentricDataRequest createPdxModeCentricDataRequest() {
        return new PdxModeCentricDataRequest();
    }

    /**
     * Create an instance of {@link PdxModeCentricIdList }
     * 
     */
    public PdxModeCentricIdList createPdxModeCentricIdList() {
        return new PdxModeCentricIdList();
    }

    /**
     * Create an instance of {@link PdxModeCentricDataResponse }
     * 
     */
    public PdxModeCentricDataResponse createPdxModeCentricDataResponse() {
        return new PdxModeCentricDataResponse();
    }

    /**
     * Create an instance of {@link InvalidParametersFaultDetail }
     * 
     */
    public InvalidParametersFaultDetail createInvalidParametersFaultDetail() {
        return new InvalidParametersFaultDetail();
    }

    /**
     * Create an instance of {@link ReferenceAngleRequest }
     * 
     */
    public ReferenceAngleRequest createReferenceAngleRequest() {
        return new ReferenceAngleRequest();
    }

    /**
     * Create an instance of {@link DataElementSettingsResponse }
     * 
     */
    public DataElementSettingsResponse createDataElementSettingsResponse() {
        return new DataElementSettingsResponse();
    }

    /**
     * Create an instance of {@link DataElementSettings }
     * 
     */
    public DataElementSettings createDataElementSettings() {
        return new DataElementSettings();
    }

    /**
     * Create an instance of {@link PdxDataAndEventsResponse }
     * 
     */
    public PdxDataAndEventsResponse createPdxDataAndEventsResponse() {
        return new PdxDataAndEventsResponse();
    }

    /**
     * Create an instance of {@link EventsList }
     * 
     */
    public EventsList createEventsList() {
        return new EventsList();
    }

    /**
     * Create an instance of {@link OverviewStateList }
     * 
     */
    public OverviewStateList createOverviewStateList() {
        return new OverviewStateList();
    }

    /**
     * Create an instance of {@link ModeValuesList }
     * 
     */
    public ModeValuesList createModeValuesList() {
        return new ModeValuesList();
    }

    /**
     * Create an instance of {@link OscShapesList }
     * 
     */
    public OscShapesList createOscShapesList() {
        return new OscShapesList();
    }

    /**
     * Create an instance of {@link MeasurementBasedOverviewStateResponse }
     * 
     */
    public MeasurementBasedOverviewStateResponse createMeasurementBasedOverviewStateResponse() {
        return new MeasurementBasedOverviewStateResponse();
    }

    /**
     * Create an instance of {@link MappingsResponse }
     * 
     */
    public MappingsResponse createMappingsResponse() {
        return new MappingsResponse();
    }

    /**
     * Create an instance of {@link IdCollection }
     * 
     */
    public IdCollection createIdCollection() {
        return new IdCollection();
    }

    /**
     * Create an instance of {@link AngleMappingList }
     * 
     */
    public AngleMappingList createAngleMappingList() {
        return new AngleMappingList();
    }

    /**
     * Create an instance of {@link InterchangeMappingList }
     * 
     */
    public InterchangeMappingList createInterchangeMappingList() {
        return new InterchangeMappingList();
    }

    /**
     * Create an instance of {@link RocMappingList }
     * 
     */
    public RocMappingList createRocMappingList() {
        return new RocMappingList();
    }

    /**
     * Create an instance of {@link NameMappingList }
     * 
     */
    public NameMappingList createNameMappingList() {
        return new NameMappingList();
    }

    /**
     * Create an instance of {@link PmuMinMaxDataResponse }
     * 
     */
    public PmuMinMaxDataResponse createPmuMinMaxDataResponse() {
        return new PmuMinMaxDataResponse();
    }

    /**
     * Create an instance of {@link ModeSettingsResponse }
     * 
     */
    public ModeSettingsResponse createModeSettingsResponse() {
        return new ModeSettingsResponse();
    }

    /**
     * Create an instance of {@link OscModeSettings }
     * 
     */
    public OscModeSettings createOscModeSettings() {
        return new OscModeSettings();
    }

    /**
     * Create an instance of {@link IdList }
     * 
     */
    public IdList createIdList() {
        return new IdList();
    }

    /**
     * Create an instance of {@link MeasurementBasedEventsResponse }
     * 
     */
    public MeasurementBasedEventsResponse createMeasurementBasedEventsResponse() {
        return new MeasurementBasedEventsResponse();
    }

    /**
     * Create an instance of {@link InvalidDataFaultDetail }
     * 
     */
    public InvalidDataFaultDetail createInvalidDataFaultDetail() {
        return new InvalidDataFaultDetail();
    }

    /**
     * Create an instance of {@link PmuMinMaxDataRequest }
     * 
     */
    public PmuMinMaxDataRequest createPmuMinMaxDataRequest() {
        return new PmuMinMaxDataRequest();
    }

    /**
     * Create an instance of {@link AveragedDataResponse }
     * 
     */
    public AveragedDataResponse createAveragedDataResponse() {
        return new AveragedDataResponse();
    }

    /**
     * Create an instance of {@link FullResolutionDataResponse }
     * 
     */
    public FullResolutionDataResponse createFullResolutionDataResponse() {
        return new FullResolutionDataResponse();
    }

    /**
     * Create an instance of {@link PdxModeFilteredDataResponse }
     * 
     */
    public PdxModeFilteredDataResponse createPdxModeFilteredDataResponse() {
        return new PdxModeFilteredDataResponse();
    }

    /**
     * Create an instance of {@link ReferenceAngleResponse }
     * 
     */
    public ReferenceAngleResponse createReferenceAngleResponse() {
        return new ReferenceAngleResponse();
    }

    /**
     * Create an instance of {@link ReferenceAngleChangeList }
     * 
     */
    public ReferenceAngleChangeList createReferenceAngleChangeList() {
        return new ReferenceAngleChangeList();
    }

    /**
     * Create an instance of {@link MeasurementBasedOverviewStateRequest }
     * 
     */
    public MeasurementBasedOverviewStateRequest createMeasurementBasedOverviewStateRequest() {
        return new MeasurementBasedOverviewStateRequest();
    }

    /**
     * Create an instance of {@link AveragedDataRequest }
     * 
     */
    public AveragedDataRequest createAveragedDataRequest() {
        return new AveragedDataRequest();
    }

    /**
     * Create an instance of {@link StringList }
     * 
     */
    public StringList createStringList() {
        return new StringList();
    }

    /**
     * Create an instance of {@link MeasurementTypeList }
     * 
     */
    public MeasurementTypeList createMeasurementTypeList() {
        return new MeasurementTypeList();
    }

    /**
     * Create an instance of {@link FullResolutionDataRequest }
     * 
     */
    public FullResolutionDataRequest createFullResolutionDataRequest() {
        return new FullResolutionDataRequest();
    }

    /**
     * Create an instance of {@link OscillationEvent }
     * 
     */
    public OscillationEvent createOscillationEvent() {
        return new OscillationEvent();
    }

    /**
     * Create an instance of {@link OverviewState }
     * 
     */
    public OverviewState createOverviewState() {
        return new OverviewState();
    }

    /**
     * Create an instance of {@link WamsEvent }
     * 
     */
    public WamsEvent createWamsEvent() {
        return new WamsEvent();
    }

    /**
     * Create an instance of {@link EventDataElement }
     * 
     */
    public EventDataElement createEventDataElement() {
        return new EventDataElement();
    }

    /**
     * Create an instance of {@link OscShapesPerMode }
     * 
     */
    public OscShapesPerMode createOscShapesPerMode() {
        return new OscShapesPerMode();
    }

    /**
     * Create an instance of {@link AngleMapping }
     * 
     */
    public AngleMapping createAngleMapping() {
        return new AngleMapping();
    }

    /**
     * Create an instance of {@link OscModeSetting }
     * 
     */
    public OscModeSetting createOscModeSetting() {
        return new OscModeSetting();
    }

    /**
     * Create an instance of {@link PdxId }
     * 
     */
    public PdxId createPdxId() {
        return new PdxId();
    }

    /**
     * Create an instance of {@link IdEntry }
     * 
     */
    public IdEntry createIdEntry() {
        return new IdEntry();
    }

    /**
     * Create an instance of {@link DomainEvent }
     * 
     */
    public DomainEvent createDomainEvent() {
        return new DomainEvent();
    }

    /**
     * Create an instance of {@link ModeValueElement }
     * 
     */
    public ModeValueElement createModeValueElement() {
        return new ModeValueElement();
    }

    /**
     * Create an instance of {@link OscShapes }
     * 
     */
    public OscShapes createOscShapes() {
        return new OscShapes();
    }

    /**
     * Create an instance of {@link OscShape }
     * 
     */
    public OscShape createOscShape() {
        return new OscShape();
    }

    /**
     * Create an instance of {@link ReferenceAngleChange }
     * 
     */
    public ReferenceAngleChange createReferenceAngleChange() {
        return new ReferenceAngleChange();
    }

    /**
     * Create an instance of {@link DataElementSetting }
     * 
     */
    public DataElementSetting createDataElementSetting() {
        return new DataElementSetting();
    }

    /**
     * Create an instance of {@link SimpleEvent }
     * 
     */
    public SimpleEvent createSimpleEvent() {
        return new SimpleEvent();
    }

    /**
     * Create an instance of {@link EventModeValueElement }
     * 
     */
    public EventModeValueElement createEventModeValueElement() {
        return new EventModeValueElement();
    }

    /**
     * Create an instance of {@link ModeValues }
     * 
     */
    public ModeValues createModeValues() {
        return new ModeValues();
    }

    /**
     * Create an instance of {@link PdxModeCentricId }
     * 
     */
    public PdxModeCentricId createPdxModeCentricId() {
        return new PdxModeCentricId();
    }

    /**
     * Create an instance of {@link SubstationEvent }
     * 
     */
    public SubstationEvent createSubstationEvent() {
        return new SubstationEvent();
    }

    /**
     * Create an instance of {@link LimitSetting }
     * 
     */
    public LimitSetting createLimitSetting() {
        return new LimitSetting();
    }

    /**
     * Create an instance of {@link RocMap }
     * 
     */
    public RocMap createRocMap() {
        return new RocMap();
    }

    /**
     * Create an instance of {@link ModeValueElementList }
     * 
     */
    public ModeValueElementList createModeValueElementList() {
        return new ModeValueElementList();
    }

    /**
     * Create an instance of {@link NameMap }
     * 
     */
    public NameMap createNameMap() {
        return new NameMap();
    }

    /**
     * Create an instance of {@link InterchangeMapping }
     * 
     */
    public InterchangeMapping createInterchangeMapping() {
        return new InterchangeMapping();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.eterra.com/public/services/data/dataTypes", name = "ConfigurationRequest")
    public JAXBElement<Object> createConfigurationRequest(Object value) {
        return new JAXBElement<Object>(_ConfigurationRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.eterra.com/public/services/data/dataTypes", name = "DataElementSettingsRequest")
    public JAXBElement<Object> createDataElementSettingsRequest(Object value) {
        return new JAXBElement<Object>(_DataElementSettingsRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.eterra.com/public/services/data/dataTypes", name = "ModeSettingsRequest")
    public JAXBElement<Object> createModeSettingsRequest(Object value) {
        return new JAXBElement<Object>(_ModeSettingsRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.eterra.com/public/services/data/dataTypes", name = "MappingsRequest")
    public JAXBElement<Object> createMappingsRequest(Object value) {
        return new JAXBElement<Object>(_MappingsRequest_QNAME, Object.class, null, value);
    }

}

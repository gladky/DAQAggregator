package rcms.utilities.daqaggregator.mappers;

import org.apache.log4j.Logger;

public enum FlashlistType {

	BU("BU", true, true),
	EVM("EVM", true, true),
	FMM_INPUT("FMMInput", true, true),
	FMM_INPUT_DETAIL("FMMInputDetail", true, false),
	FMM_STATUS("FMMStatus", true, true),
	RU("RU", true, true),
	FEROL_CONFIGURATION("ferolConfiguration", true, true),
	FEROL_INPUT_STREAM("ferolInputStream", true, true),
	FEROL_MONITORING("ferolMonitoring", true, false),
	FEROL_STATUS("ferolStatus", true, true),
	FEROL_TCP_STREAM("ferolTcpStream", true, false),
	FRL_MONITORING("frlMonitoring", true, true),
	HOST_INFO("hostInfo", true, false),
	LEVEL_ZERO_FM_DYNAMIC("levelZeroFM_dynamic", false, true),
	LEVEL_ZERO_FM_STATIC("levelZeroFM_static", true, false),
	LEVEL_ZERO_FM_SUBSYS("levelZeroFM_subsys", false, true),
	JOB_CONTROL("jobcontrol", false, true),
	DISK_INFO("diskInfo", true, false),
	FMM_PARTITION_DEAD_TIME("FMMPartitionDeadTime", true, false),
	FMM_FED_DEAD_TIME("FMMFEDDeadTime", true, false);

	private static Logger logger = Logger.getLogger(FlashlistType.class);

	private final String name;

	/**
	 * Retrieval of flashlist is in session context. Note that not every
	 * flashlist needs session id to retrieve.
	 */
	private final boolean sessionContext;

	private final boolean download;

	private FlashlistType(String name, boolean sessionContext, boolean download) {
		this.name = name;
		this.sessionContext = sessionContext;
		this.download = download;
	}

	private static String message = " flashlist type infered from name ";

	public static FlashlistType inferTypeByName(String name) {
		if (name.toLowerCase().contains(BU.name.toLowerCase())) {
			logger.debug(BU.name + message + name);
			return BU;
		} else if (name.toLowerCase().contains(RU.name.toLowerCase())) {
			logger.debug(RU.name + message + name);
			return RU;

		} else if (name.toLowerCase().contains(FMM_INPUT_DETAIL.name.toLowerCase())) {
			logger.debug(FMM_INPUT_DETAIL.name + message + name);
			return FMM_INPUT_DETAIL;

		} else if (name.toLowerCase().contains(FMM_INPUT.name.toLowerCase())) {
			logger.debug(FMM_INPUT.name + message + name);
			return FMM_INPUT;

		} else if (name.toLowerCase().contains(EVM.name.toLowerCase())) {
			logger.debug(EVM.name + message + name);
			return EVM;

		} else if (name.toLowerCase().contains(FMM_STATUS.name.toLowerCase())) {
			logger.debug(FMM_STATUS.name + message + name);
			return FMM_STATUS;

		} else if (name.toLowerCase().contains(FEROL_CONFIGURATION.name.toLowerCase())) {
			logger.debug(FEROL_CONFIGURATION.name + message + name);
			return FEROL_CONFIGURATION;

		} else if (name.toLowerCase().contains(FEROL_INPUT_STREAM.name.toLowerCase())) {
			logger.debug(FEROL_INPUT_STREAM.name + message + name);
			return FEROL_INPUT_STREAM;

		} else if (name.toLowerCase().contains(FEROL_MONITORING.name.toLowerCase())) {
			logger.debug(FEROL_MONITORING.name + message + name);
			return FEROL_MONITORING;

		} else if (name.toLowerCase().contains(FEROL_STATUS.name.toLowerCase())) {
			logger.debug(FEROL_STATUS.name + message + name);
			return FEROL_STATUS;

		} else if (name.toLowerCase().contains(FEROL_TCP_STREAM.name.toLowerCase())) {
			logger.debug(FEROL_TCP_STREAM.name + message + name);
			return FEROL_TCP_STREAM;

		} else if (name.toLowerCase().contains(FRL_MONITORING.name.toLowerCase())) {
			logger.debug(FRL_MONITORING.name + message + name);
			return FRL_MONITORING;

		} else if (name.toLowerCase().contains(HOST_INFO.name.toLowerCase())) {
			logger.debug(HOST_INFO.name + message + name);
			return HOST_INFO;

		} else if (name.toLowerCase().contains(LEVEL_ZERO_FM_DYNAMIC.name.toLowerCase())) {
			logger.debug(LEVEL_ZERO_FM_DYNAMIC.name + message + name);
			return LEVEL_ZERO_FM_DYNAMIC;

		} else if (name.toLowerCase().contains(LEVEL_ZERO_FM_STATIC.name.toLowerCase())) {
			logger.debug(LEVEL_ZERO_FM_STATIC.name + message + name);
			return LEVEL_ZERO_FM_STATIC;

		} else if (name.toLowerCase().contains(LEVEL_ZERO_FM_SUBSYS.name.toLowerCase())) {
			logger.debug(LEVEL_ZERO_FM_SUBSYS.name + message + name);
			return LEVEL_ZERO_FM_SUBSYS;

		} else if (name.toLowerCase().contains(JOB_CONTROL.name.toLowerCase())) {
			logger.debug(JOB_CONTROL.name + message + name);
			return JOB_CONTROL;

		} else if (name.toLowerCase().contains(DISK_INFO.name.toLowerCase())) {
			logger.debug(DISK_INFO.name + message + name);
			return DISK_INFO;

		} else if (name.toLowerCase().contains(FMM_PARTITION_DEAD_TIME.name.toLowerCase())) {
			logger.debug(FMM_PARTITION_DEAD_TIME.name + message + name);
			return FMM_PARTITION_DEAD_TIME;

		} else if (name.toLowerCase().contains(FMM_FED_DEAD_TIME.name.toLowerCase())) {
			logger.debug(FMM_FED_DEAD_TIME.name + message + name);
			return FMM_FED_DEAD_TIME;

		} else {

			logger.warn("Cannot infer flashlist type from name " + name);
			return null;
		}

	}

	public boolean isSessionContext() {
		return sessionContext;
	}

	public boolean isDownload() {
		return download;
	}

}

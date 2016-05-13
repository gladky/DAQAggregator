package rcms.utilities.daqaggregator.data;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.databind.JsonNode;

import rcms.utilities.daqaggregator.mappers.FlashlistType;
import rcms.utilities.daqaggregator.mappers.FlashlistUpdatable;

/**
 * Timing Trigger and Control Partition
 * 
 * @author Andre Georg Holzner (andre.georg.holzner@cern.ch)
 * @author Maciej Gladki (maciej.szymon.gladki@cern.ch)
 */

@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id")
public class TTCPartition implements java.io.Serializable, FlashlistUpdatable {

	// ----------------------------------------
	// fields set at beginning of session
	// ----------------------------------------

	private String name;

	private boolean masked;

	/** can be null */
	private FMM fmm;

	// ----------------------------------------
	// fields updated periodically
	// ----------------------------------------

	private String ttsState;

	private float percentWarning;

	private float percentBusy;

	@Override
	public void updateFromFlashlist(FlashlistType flashlistType, JsonNode flashlistRow) {

		if (flashlistType == FlashlistType.FMM_STATUS) {
			// TODO what about B?
			this.percentBusy = (float) flashlistRow.get("outputFractionBusyA").asDouble();
			this.percentWarning = (float) flashlistRow.get("outputFractionWarningA").asDouble();
			this.ttsState = flashlistRow.get("outputStateA").asText();
		}

	}

	public String getTtsState() {
		return ttsState;
	}

	public void setTtsState(String ttsState) {
		this.ttsState = ttsState;
	}

	public float getPercentWarning() {
		return percentWarning;
	}

	public void setPercentWarning(float percentWarning) {
		this.percentWarning = percentWarning;
	}

	public float getPercentBusy() {
		return percentBusy;
	}

	public void setPercentBusy(float percentBusy) {
		this.percentBusy = percentBusy;
	}

	public String getName() {
		return name;
	}

	public boolean isMasked() {
		return masked;
	}

	public FMM getFmm() {
		return fmm;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMasked(boolean masked) {
		this.masked = masked;
	}

	public void setFmm(FMM fmm) {
		this.fmm = fmm;
	}

}
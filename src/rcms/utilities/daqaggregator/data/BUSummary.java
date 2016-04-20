package rcms.utilities.daqaggregator.data;

/** summary statistics of BUs */
public class BUSummary {
	
	//----------------------------------------
	// fields set at beginning of session
	//----------------------------------------

	/** parent */
	private final DAQ daq;

	//----------------------------------------
	// fields updated periodically
	//----------------------------------------
  
	/** event rate in kHz ? */
	private float rate;
  
	/** throughput in MByte/s ? */
	private float throughput;
  
	/** in MByte/s ? */
	private float eventSizeMean;
	private float eventSizeStddev;

	/** is this processed or requested ? */
	private int numEvents;
  
	private int numEventsInBU;
  
	private int priority;
  
	private int numRequestsSent;
  
	private int numRequestsUsed;
  
	private int numRequestsBlocked;
  
	private int numFUsHlt;
  
	private int numFUsCrashed;
  
	private int numFUsStale;
  
	private int numFUsCloud;
  
	/** in percent ? */
	private float ramDiskUsage;
  
	/** total amount of ramdisk */
	private float ramDiskTotal;
  
	/** processed ? to be processed ? on ramdisk ? */
	private int numFiles;
  
	private int numLumisectionsWithFiles;
  
	private int currentLumisection;
  
	private int numLumisectionsForHLT;
  
	private int numLumisectionsOutHLT;

	//----------------------------------------------------------------------

	public BUSummary(DAQ daq) {
		this.daq = daq;
	}

	//----------------------------------------------------------------------

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	public float getThroughput() {
		return throughput;
	}

	public void setThroughput(float throughput) {
		this.throughput = throughput;
	}

	public float getEventSizeMean() {
		return eventSizeMean;
	}

	public void setEventSizeMean(float eventSizeMean) {
		this.eventSizeMean = eventSizeMean;
	}

	public float getEventSizeStddev() {
		return eventSizeStddev;
	}

	public void setEventSizeStddev(float eventSizeStddev) {
		this.eventSizeStddev = eventSizeStddev;
	}

	public int getNumEvents() {
		return numEvents;
	}

	public void setNumEvents(int numEvents) {
		this.numEvents = numEvents;
	}

	public int getNumEventsInBU() {
		return numEventsInBU;
	}

	public void setNumEventsInBU(int numEventsInBU) {
		this.numEventsInBU = numEventsInBU;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public int getNumRequestsSent() {
		return numRequestsSent;
	}

	public void setNumRequestsSent(int numRequestsSent) {
		this.numRequestsSent = numRequestsSent;
	}

	public int getNumRequestsUsed() {
		return numRequestsUsed;
	}

	public void setNumRequestsUsed(int numRequestsUsed) {
		this.numRequestsUsed = numRequestsUsed;
	}

	public int getNumRequestsBlocked() {
		return numRequestsBlocked;
	}

	public void setNumRequestsBlocked(int numRequestsBlocked) {
		this.numRequestsBlocked = numRequestsBlocked;
	}

	public int getNumFUsHlt() {
		return numFUsHlt;
	}

	public void setNumFUsHlt(int numFUsHlt) {
		this.numFUsHlt = numFUsHlt;
	}

	public int getNumFUsCrashed() {
		return numFUsCrashed;
	}

	public void setNumFUsCrashed(int numFUsCrashed) {
		this.numFUsCrashed = numFUsCrashed;
	}

	public int getNumFUsStale() {
		return numFUsStale;
	}

	public void setNumFUsStale(int numFUsStale) {
		this.numFUsStale = numFUsStale;
	}

	public int getNumFUsCloud() {
		return numFUsCloud;
	}

	public void setNumFUsCloud(int numFUsCloud) {
		this.numFUsCloud = numFUsCloud;
	}

	public float getRamDiskUsage() {
		return ramDiskUsage;
	}

	public void setRamDiskUsage(float ramDiskUsage) {
		this.ramDiskUsage = ramDiskUsage;
	}

	public float getRamDiskTotal() {
		return ramDiskTotal;
	}

	public void setRamDiskTotal(float ramDiskTotal) {
		this.ramDiskTotal = ramDiskTotal;
	}

	public int getNumFiles() {
		return numFiles;
	}

	public void setNumFiles(int numFiles) {
		this.numFiles = numFiles;
	}

	public int getNumLumisectionsWithFiles() {
		return numLumisectionsWithFiles;
	}

	public void setNumLumisectionsWithFiles(int numLumisectionsWithFiles) {
		this.numLumisectionsWithFiles = numLumisectionsWithFiles;
	}

	public int getCurrentLumisection() {
		return currentLumisection;
	}

	public void setCurrentLumisection(int currentLumisection) {
		this.currentLumisection = currentLumisection;
	}

	public int getNumLumisectionsForHLT() {
		return numLumisectionsForHLT;
	}

	public void setNumLumisectionsForHLT(int numLumisectionsForHLT) {
		this.numLumisectionsForHLT = numLumisectionsForHLT;
	}

	public int getNumLumisectionsOutHLT() {
		return numLumisectionsOutHLT;
	}

	public void setNumLumisectionsOutHLT(int numLumisectionsOutHLT) {
		this.numLumisectionsOutHLT = numLumisectionsOutHLT;
	}

	public DAQ getDaq() {
		return daq;
	}
	
	//----------------------------------------------------------------------


}
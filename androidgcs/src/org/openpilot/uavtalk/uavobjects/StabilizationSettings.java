/**
 ******************************************************************************
 *
 * @file       uavobjecttemplate.cpp
 * @author     The OpenPilot Team, http://www.openpilot.org Copyright (C) 2010.
 * @brief      Template for an uavobject in java
 *             This is a autogenerated file!! Do not modify and expect a result.
 *             PID settings used by the Stabilization module to combine the @ref AttitudeActual and @ref AttitudeDesired to compute @ref ActuatorDesired
 *
 * @see        The GNU Public License (GPL) Version 3
 *
 *****************************************************************************/
/*
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 * for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 */

package org.openpilot.uavtalk.uavobjects;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.openpilot.uavtalk.UAVObjectManager;
import org.openpilot.uavtalk.UAVObject;
import org.openpilot.uavtalk.UAVDataObject;
import org.openpilot.uavtalk.UAVObjectField;

/**
PID settings used by the Stabilization module to combine the @ref AttitudeActual and @ref AttitudeDesired to compute @ref ActuatorDesired

generated from stabilizationsettings.xml
 **/
public class StabilizationSettings extends UAVDataObject {

	public StabilizationSettings() {
		super(OBJID, ISSINGLEINST, ISSETTINGS, NAME);
		
		List<UAVObjectField> fields = new ArrayList<UAVObjectField>();
		

		List<String> RollMaxElemNames = new ArrayList<String>();
		RollMaxElemNames.add("0");
		fields.add( new UAVObjectField("RollMax", "degrees", UAVObjectField.FieldType.UINT8, RollMaxElemNames, null) );

		List<String> PitchMaxElemNames = new ArrayList<String>();
		PitchMaxElemNames.add("0");
		fields.add( new UAVObjectField("PitchMax", "degrees", UAVObjectField.FieldType.UINT8, PitchMaxElemNames, null) );

		List<String> YawMaxElemNames = new ArrayList<String>();
		YawMaxElemNames.add("0");
		fields.add( new UAVObjectField("YawMax", "degrees", UAVObjectField.FieldType.UINT8, YawMaxElemNames, null) );

		List<String> ManualRateElemNames = new ArrayList<String>();
		ManualRateElemNames.add("Roll");
		ManualRateElemNames.add("Pitch");
		ManualRateElemNames.add("Yaw");
		fields.add( new UAVObjectField("ManualRate", "degrees/sec", UAVObjectField.FieldType.FLOAT32, ManualRateElemNames, null) );

		List<String> MaximumRateElemNames = new ArrayList<String>();
		MaximumRateElemNames.add("Roll");
		MaximumRateElemNames.add("Pitch");
		MaximumRateElemNames.add("Yaw");
		fields.add( new UAVObjectField("MaximumRate", "degrees/sec", UAVObjectField.FieldType.FLOAT32, MaximumRateElemNames, null) );

		List<String> RollRatePIElemNames = new ArrayList<String>();
		RollRatePIElemNames.add("Kp");
		RollRatePIElemNames.add("Ki");
		RollRatePIElemNames.add("ILimit");
		fields.add( new UAVObjectField("RollRatePI", "", UAVObjectField.FieldType.FLOAT32, RollRatePIElemNames, null) );

		List<String> PitchRatePIElemNames = new ArrayList<String>();
		PitchRatePIElemNames.add("Kp");
		PitchRatePIElemNames.add("Ki");
		PitchRatePIElemNames.add("ILimit");
		fields.add( new UAVObjectField("PitchRatePI", "", UAVObjectField.FieldType.FLOAT32, PitchRatePIElemNames, null) );

		List<String> YawRatePIElemNames = new ArrayList<String>();
		YawRatePIElemNames.add("Kp");
		YawRatePIElemNames.add("Ki");
		YawRatePIElemNames.add("ILimit");
		fields.add( new UAVObjectField("YawRatePI", "", UAVObjectField.FieldType.FLOAT32, YawRatePIElemNames, null) );

		List<String> RollPIElemNames = new ArrayList<String>();
		RollPIElemNames.add("Kp");
		RollPIElemNames.add("Ki");
		RollPIElemNames.add("ILimit");
		fields.add( new UAVObjectField("RollPI", "", UAVObjectField.FieldType.FLOAT32, RollPIElemNames, null) );

		List<String> PitchPIElemNames = new ArrayList<String>();
		PitchPIElemNames.add("Kp");
		PitchPIElemNames.add("Ki");
		PitchPIElemNames.add("ILimit");
		fields.add( new UAVObjectField("PitchPI", "", UAVObjectField.FieldType.FLOAT32, PitchPIElemNames, null) );

		List<String> YawPIElemNames = new ArrayList<String>();
		YawPIElemNames.add("Kp");
		YawPIElemNames.add("Ki");
		YawPIElemNames.add("ILimit");
		fields.add( new UAVObjectField("YawPI", "", UAVObjectField.FieldType.FLOAT32, YawPIElemNames, null) );


		// Compute the number of bytes for this object
		int numBytes = 0;
		ListIterator<UAVObjectField> li = fields.listIterator();
		while(li.hasNext()) {
			numBytes += li.next().getNumBytes();
		}
		NUMBYTES = numBytes;

		// Initialize object
		initializeFields(fields, ByteBuffer.allocate(NUMBYTES), NUMBYTES);
		// Set the default field values
		setDefaultFieldValues();
		// Set the object description
		setDescription(DESCRIPTION);
	}

	/**
	 * Create a Metadata object filled with default values for this object
	 * @return Metadata object with default values
	 */
	public Metadata getDefaultMetadata() {
		UAVObject.Metadata metadata = new UAVObject.Metadata();
		metadata.gcsAccess = UAVObject.AccessMode.ACCESS_READWRITE;
		metadata.gcsTelemetryAcked = UAVObject.Acked.TRUE;
		metadata.gcsTelemetryUpdateMode = UAVObject.UpdateMode.UPDATEMODE_ONCHANGE;
		metadata.gcsTelemetryUpdatePeriod = 0;

		metadata.flightAccess = UAVObject.AccessMode.ACCESS_READWRITE;
		metadata.flightTelemetryAcked = UAVObject.Acked.TRUE;
		metadata.flightTelemetryUpdateMode = UAVObject.UpdateMode.UPDATEMODE_ONCHANGE;
		metadata.flightTelemetryUpdatePeriod = 0;

		metadata.loggingUpdateMode = UAVObject.UpdateMode.UPDATEMODE_NEVER;
		metadata.loggingUpdatePeriod = 0;
		return metadata;
	}

	/**
	 * Initialize object fields with the default values.
	 * If a default value is not specified the object fields
	 * will be initialized to zero.
	 */
	public void setDefaultFieldValues()
	{
		getField("RollMax").setValue(35);
		getField("PitchMax").setValue(35);
		getField("YawMax").setValue(35);
		getField("ManualRate").setValue(150,0);
		getField("ManualRate").setValue(150,1);
		getField("ManualRate").setValue(150,2);
		getField("MaximumRate").setValue(300,0);
		getField("MaximumRate").setValue(300,1);
		getField("MaximumRate").setValue(300,2);
		getField("RollRatePI").setValue(0.0015,0);
		getField("RollRatePI").setValue(0,1);
		getField("RollRatePI").setValue(0.3,2);
		getField("PitchRatePI").setValue(0.0015,0);
		getField("PitchRatePI").setValue(0,1);
		getField("PitchRatePI").setValue(0.3,2);
		getField("YawRatePI").setValue(0.003,0);
		getField("YawRatePI").setValue(0,1);
		getField("YawRatePI").setValue(0.3,2);
		getField("RollPI").setValue(2,0);
		getField("RollPI").setValue(0,1);
		getField("RollPI").setValue(50,2);
		getField("PitchPI").setValue(2,0);
		getField("PitchPI").setValue(0,1);
		getField("PitchPI").setValue(50,2);
		getField("YawPI").setValue(2,0);
		getField("YawPI").setValue(0,1);
		getField("YawPI").setValue(50,2);

	}

	/**
	 * Create a clone of this object, a new instance ID must be specified.
	 * Do not use this function directly to create new instances, the
	 * UAVObjectManager should be used instead.
	 */
	public UAVDataObject clone(int instID) {
		// TODO: Need to get specific instance to clone
		try {
			StabilizationSettings obj = new StabilizationSettings();
			obj.initialize(instID, this.getMetaObject());
			return obj;
		} catch  (Exception e) {
			return null;
		}
	}

	/**
	 * Static function to retrieve an instance of the object.
	 */
	public StabilizationSettings GetInstance(UAVObjectManager objMngr, int instID)
	{
	    return (StabilizationSettings)(objMngr.getObject(StabilizationSettings.OBJID, instID));
	}

	// Constants
	protected static final int OBJID = 0xE2147404;
	protected static final String NAME = "StabilizationSettings";
	protected static String DESCRIPTION = "PID settings used by the Stabilization module to combine the @ref AttitudeActual and @ref AttitudeDesired to compute @ref ActuatorDesired";
	protected static final boolean ISSINGLEINST = 1 == 1;
	protected static final boolean ISSETTINGS = 1 == 1;
	protected static int NUMBYTES = 0;


}
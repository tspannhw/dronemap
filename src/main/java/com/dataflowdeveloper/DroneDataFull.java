package com.dataflowdeveloper;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * @author tspann
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DroneDataFull implements Serializable {

	private static final long serialVersionUID = 8198045227677015331L;
	
@JsonProperty("date")
private String date;
@JsonProperty("Compression")
private String compression;
@JsonProperty("Exif Version")
private String exifVersion;
@JsonProperty("Components Configuration")
private String componentsConfiguration;
@JsonProperty("file.group")
private String fileGroup;
@JsonProperty("Compression Type")
private String compressionType;
@JsonProperty("Image Description")
private String imageDescription;
@JsonProperty("Number of Components")
private String numberOfComponents;
@JsonProperty("Component 2")
private String component2;
@JsonProperty("Focal Length")
private String focalLength;
@JsonProperty("Component 1")
private String component1;
@JsonProperty("YCbCr Positioning")
private String yCbCrPositioning;
@JsonProperty("tiff:ResolutionUnit")
private String tiffResolutionUnit;
@JsonProperty("uuid")
private String uuid;
@JsonProperty("Date/Time Original")
private String dateTimeOriginal;
@JsonProperty("Shutter Speed Value")
private String shutterSpeedValue;
@JsonProperty("X Resolution")
private String xResolution;
@JsonProperty("tiff:Make")
private String tiffMake;
@JsonProperty("path")
private String path;
@JsonProperty("Photometric Interpretation")
private String photometricInterpretation;
@JsonProperty("Component 3")
private String component3;
@JsonProperty("Unique Image ID")
private String uniqueImageID;
@JsonProperty("F-Number")
private String fNumber;
@JsonProperty("modified")
private String modified;
@JsonProperty("Focal Length 35")
private String focalLength35;
@JsonProperty("tiff:BitsPerSample")
private String tiffBitsPerSample;
@JsonProperty("Exposure Program")
private String exposureProgram;
@JsonProperty("GPS Version ID")
private String gPSVersionID;
@JsonProperty("GPS Latitude Ref")
private String gPSLatitudeRef;
@JsonProperty("meta:creation-date")
private String metaCreationDate;
@JsonProperty("exif:FNumber")
private String exifFNumber;
@JsonProperty("GPS Altitude Ref")
private String gPSAltitudeRef;
@JsonProperty("Exposure Time")
private String exposureTime;
@JsonProperty("GPS Longitude")
private String gPSLongitude;
@JsonProperty("Creation-Date")
private String creationDate;
@JsonProperty("ISO Speed Ratings")
private String iSOSpeedRatings;
@JsonProperty("Make")
private String make;
@JsonProperty("Orientation")
private String orientation;
@JsonProperty("Metering Mode")
private String meteringMode;
@JsonProperty("tiff:Orientation")
private String tiffOrientation;
@JsonProperty("GPS Longitude Ref")
private String gPSLongitudeRef;
@JsonProperty("tiff:Software")
private String tiffSoftware;
@JsonProperty("exif:FocalLength")
private String exifFocalLength;
@JsonProperty("filename")
private String filename;
@JsonProperty("XMP Value Count")
private String xMPValueCount;
@JsonProperty("geo:long")
private String geoLong;
@JsonProperty("file.owner")
private String fileOwner;
@JsonProperty("Software")
private String software;
@JsonProperty("Exif Image Height")
private String exifImageHeight;
@JsonProperty("tiff:YResolution")
private String tiffYResolution;
@JsonProperty("Y Resolution")
private String yResolution;
@JsonProperty("GPS Latitude")
private String gPSLatitude;
@JsonProperty("dc:description")
private String dcDescription;
@JsonProperty("geo:lat")
private String geoLat;
@JsonProperty("FlashPix Version")
private String flashPixVersion;
@JsonProperty("Data Precision")
private String dataPrecision;
@JsonProperty("White Balance")
private String whiteBalance;
@JsonProperty("tiff:ImageLength")
private String tiffImageLength;
@JsonProperty("description")
private String description;
@JsonProperty("dcterms:created")
private String dctermsCreated;
@JsonProperty("dcterms:modified")
private String dctermsModified;
@JsonProperty("Last-Modified")
private String lastModified;
@JsonProperty("file.permissions")
private String filePermissions;
@JsonProperty("exif:ExposureTime")
private String exifExposureTime;
@JsonProperty("Last-Save-Date")
private String lastSaveDate;
@JsonProperty("GPS Altitude")
private String gPSAltitude;
@JsonProperty("absolute.path")
private String absolutePath;
@JsonProperty("Color Space")
private String colorSpace;
@JsonProperty("File Size")
private String fileSize;
@JsonProperty("meta:save-date")
private String metaSaveDate;
@JsonProperty("file.creationTime")
private String fileCreationTime;
@JsonProperty("Date/Time Digitized")
private String dateTimeDigitized;
@JsonProperty("File Name")
private String fileName;
@JsonProperty("Content-Type")
private String contentType;
@JsonProperty("Aperture Value")
private String apertureValue;
@JsonProperty("X-Parsed-By")
private String xParsedBy;
@JsonProperty("File Modified Date")
private String fileModifiedDate;
@JsonProperty("tiff:XResolution")
private String tiffXResolution;
@JsonProperty("file.lastModifiedTime")
private String fileLastModifiedTime;
@JsonProperty("exif:DateTimeOriginal")
private String exifDateTimeOriginal;
@JsonProperty("Date/Time")
private String dateTime;
@JsonProperty("Exif Image Width")
private String exifImageWidth;
@JsonProperty("Image Height")
private String imageHeight;
@JsonProperty("Image Width")
private String imageWidth;
@JsonProperty("Unknown tag (0xc62f)")
private String unknownTag0xc62f;
@JsonProperty("Resolution Unit")
private String resolutionUnit;
@JsonProperty("tiff:Model")
private String tiffModel;
@JsonProperty("exif:IsoSpeedRatings")
private String exifIsoSpeedRatings;
@JsonProperty("Max Aperture Value")
private String maxApertureValue;
@JsonProperty("Exposure Mode")
private String exposureMode;
@JsonProperty("Model")
private String model;
@JsonProperty("file.lastAccessTime")
private String fileLastAccessTime;
@JsonProperty("tiff:ImageWidth")
private String tiffImageWidth;
@JsonProperty("White Balance Mode")
private String whiteBalanceMode;
@JsonProperty("inception")
private String inception;


public String getInception() {
	return inception;
}

public void setInception(String inception) {
	this.inception = inception;
}

/**
* No args constructor for use in serialization
* 
*/
public DroneDataFull() {
	super();
}

/**
* 
* @param tiffImageLength
* @param maxApertureValue
* @param exposureTime
* @param apertureValue
* @param xMPValueCount
* @param tiffSoftware
* @param exifFocalLength
* @param contentType
* @param shutterSpeedValue
* @param dataPrecision
* @param software
* @param yCbCrPositioning
* @param whiteBalanceMode
* @param tiffImageWidth
* @param description
* @param dctermsCreated
* @param fileLastModifiedTime
* @param compression
* @param exifFNumber
* @param exposureProgram
* @param compressionType
* @param iSOSpeedRatings
* @param filePermissions
* @param gPSAltitudeRef
* @param gPSVersionID
* @param orientation
* @param fileGroup
* @param exifImageHeight
* @param fileOwner
* @param flashPixVersion
* @param tiffBitsPerSample
* @param fileCreationTime
* @param gPSLatitude
* @param modified
* @param focalLength
* @param resolutionUnit
* @param exposureMode
* @param exifImageWidth
* @param xParsedBy
* @param dateTimeDigitized
* @param dcDescription
* @param fileName
* @param fileModifiedDate
* @param geoLong
* @param uuid
* @param make
* @param imageWidth
* @param exifVersion
* @param tiffXResolution
* @param model
* @param fileLastAccessTime
* @param dateTime
* @param exifDateTimeOriginal
* @param fNumber
* @param yResolution
* @param uniqueImageID
* @param tiffModel
* @param exifExposureTime
* @param whiteBalance
* @param unknownTag0xc62f
* @param date
* @param gPSLongitude
* @param gPSAltitude
* @param dctermsModified
* @param fileSize
* @param gPSLatitudeRef
* @param tiffYResolution
* @param numberOfComponents
* @param path
* @param xResolution
* @param tiffMake
* @param meteringMode
* @param tiffResolutionUnit
* @param photometricInterpretation
* @param focalLength35
* @param imageDescription
* @param imageHeight
* @param lastModified
* @param component3
* @param component1
* @param component2
* @param gPSLongitudeRef
* @param lastSaveDate
* @param componentsConfiguration
* @param absolutePath
* @param exifIsoSpeedRatings
* @param creationDate
* @param tiffOrientation
* @param geoLat
* @param metaSaveDate
* @param colorSpace
* @param filename
* @param dateTimeOriginal
* @param metaCreationDate
*/
public DroneDataFull(String date, String compression, String exifVersion, String componentsConfiguration, String fileGroup, String compressionType, String imageDescription, String numberOfComponents, String component2, String focalLength, String component1, String yCbCrPositioning, String tiffResolutionUnit, String uuid, String dateTimeOriginal, String shutterSpeedValue, String xResolution, String tiffMake, String path, String photometricInterpretation, String component3, String uniqueImageID, String fNumber, String modified, String focalLength35, String tiffBitsPerSample, String exposureProgram, String gPSVersionID, String gPSLatitudeRef, String metaCreationDate, String exifFNumber, String gPSAltitudeRef, String exposureTime, String gPSLongitude, String creationDate, String iSOSpeedRatings, String make, String orientation, String meteringMode, String tiffOrientation, String gPSLongitudeRef, String tiffSoftware, String exifFocalLength, String filename, String xMPValueCount, String geoLong, String fileOwner, String software, String exifImageHeight, String tiffYResolution, String yResolution, String gPSLatitude, String dcDescription, String geoLat, String flashPixVersion, String dataPrecision, String whiteBalance, String tiffImageLength, String description, String dctermsCreated, String dctermsModified, String lastModified, String filePermissions, String exifExposureTime, String lastSaveDate, String gPSAltitude, String absolutePath, String colorSpace, String fileSize, String metaSaveDate, String fileCreationTime, String dateTimeDigitized, String fileName, String contentType, String apertureValue, String xParsedBy, String fileModifiedDate, String tiffXResolution, String fileLastModifiedTime, String exifDateTimeOriginal, String dateTime, String exifImageWidth, String imageHeight, String imageWidth, String unknownTag0xc62f, String resolutionUnit, String tiffModel, String exifIsoSpeedRatings, String maxApertureValue, String exposureMode, String model, String fileLastAccessTime, String tiffImageWidth, String whiteBalanceMode) {
super();
this.date = date;
this.compression = compression;
this.exifVersion = exifVersion;
this.componentsConfiguration = componentsConfiguration;
this.fileGroup = fileGroup;
this.compressionType = compressionType;
this.imageDescription = imageDescription;
this.numberOfComponents = numberOfComponents;
this.component2 = component2;
this.focalLength = focalLength;
this.component1 = component1;
this.yCbCrPositioning = yCbCrPositioning;
this.tiffResolutionUnit = tiffResolutionUnit;
this.uuid = uuid;
this.dateTimeOriginal = dateTimeOriginal;
this.shutterSpeedValue = shutterSpeedValue;
this.xResolution = xResolution;
this.tiffMake = tiffMake;
this.path = path;
this.photometricInterpretation = photometricInterpretation;
this.component3 = component3;
this.uniqueImageID = uniqueImageID;
this.fNumber = fNumber;
this.modified = modified;
this.focalLength35 = focalLength35;
this.tiffBitsPerSample = tiffBitsPerSample;
this.exposureProgram = exposureProgram;
this.gPSVersionID = gPSVersionID;
this.gPSLatitudeRef = gPSLatitudeRef;
this.metaCreationDate = metaCreationDate;
this.exifFNumber = exifFNumber;
this.gPSAltitudeRef = gPSAltitudeRef;
this.exposureTime = exposureTime;
this.gPSLongitude = gPSLongitude;
this.creationDate = creationDate;
this.iSOSpeedRatings = iSOSpeedRatings;
this.make = make;
this.orientation = orientation;
this.meteringMode = meteringMode;
this.tiffOrientation = tiffOrientation;
this.gPSLongitudeRef = gPSLongitudeRef;
this.tiffSoftware = tiffSoftware;
this.exifFocalLength = exifFocalLength;
this.filename = filename;
this.xMPValueCount = xMPValueCount;
this.geoLong = geoLong;
this.fileOwner = fileOwner;
this.software = software;
this.exifImageHeight = exifImageHeight;
this.tiffYResolution = tiffYResolution;
this.yResolution = yResolution;
this.gPSLatitude = gPSLatitude;
this.dcDescription = dcDescription;
this.geoLat = geoLat;
this.flashPixVersion = flashPixVersion;
this.dataPrecision = dataPrecision;
this.whiteBalance = whiteBalance;
this.tiffImageLength = tiffImageLength;
this.description = description;
this.dctermsCreated = dctermsCreated;
this.dctermsModified = dctermsModified;
this.lastModified = lastModified;
this.filePermissions = filePermissions;
this.exifExposureTime = exifExposureTime;
this.lastSaveDate = lastSaveDate;
this.gPSAltitude = gPSAltitude;
this.absolutePath = absolutePath;
this.colorSpace = colorSpace;
this.fileSize = fileSize;
this.metaSaveDate = metaSaveDate;
this.fileCreationTime = fileCreationTime;
this.dateTimeDigitized = dateTimeDigitized;
this.fileName = fileName;
this.contentType = contentType;
this.apertureValue = apertureValue;
this.xParsedBy = xParsedBy;
this.fileModifiedDate = fileModifiedDate;
this.tiffXResolution = tiffXResolution;
this.fileLastModifiedTime = fileLastModifiedTime;
this.exifDateTimeOriginal = exifDateTimeOriginal;
this.dateTime = dateTime;
this.exifImageWidth = exifImageWidth;
this.imageHeight = imageHeight;
this.imageWidth = imageWidth;
this.unknownTag0xc62f = unknownTag0xc62f;
this.resolutionUnit = resolutionUnit;
this.tiffModel = tiffModel;
this.exifIsoSpeedRatings = exifIsoSpeedRatings;
this.maxApertureValue = maxApertureValue;
this.exposureMode = exposureMode;
this.model = model;
this.fileLastAccessTime = fileLastAccessTime;
this.tiffImageWidth = tiffImageWidth;
this.whiteBalanceMode = whiteBalanceMode;
}

@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("DroneData [date=");
	builder.append(date);
	builder.append(", compression=");
	builder.append(compression);
	builder.append(", exifVersion=");
	builder.append(exifVersion);
	builder.append(", componentsConfiguration=");
	builder.append(componentsConfiguration);
	builder.append(", fileGroup=");
	builder.append(fileGroup);
	builder.append(", compressionType=");
	builder.append(compressionType);
	builder.append(", imageDescription=");
	builder.append(imageDescription);
	builder.append(", numberOfComponents=");
	builder.append(numberOfComponents);
	builder.append(", component2=");
	builder.append(component2);
	builder.append(", focalLength=");
	builder.append(focalLength);
	builder.append(", component1=");
	builder.append(component1);
	builder.append(", yCbCrPositioning=");
	builder.append(yCbCrPositioning);
	builder.append(", tiffResolutionUnit=");
	builder.append(tiffResolutionUnit);
	builder.append(", uuid=");
	builder.append(uuid);
	builder.append(", dateTimeOriginal=");
	builder.append(dateTimeOriginal);
	builder.append(", shutterSpeedValue=");
	builder.append(shutterSpeedValue);
	builder.append(", xResolution=");
	builder.append(xResolution);
	builder.append(", tiffMake=");
	builder.append(tiffMake);
	builder.append(", path=");
	builder.append(path);
	builder.append(", photometricInterpretation=");
	builder.append(photometricInterpretation);
	builder.append(", component3=");
	builder.append(component3);
	builder.append(", uniqueImageID=");
	builder.append(uniqueImageID);
	builder.append(", fNumber=");
	builder.append(fNumber);
	builder.append(", modified=");
	builder.append(modified);
	builder.append(", focalLength35=");
	builder.append(focalLength35);
	builder.append(", tiffBitsPerSample=");
	builder.append(tiffBitsPerSample);
	builder.append(", exposureProgram=");
	builder.append(exposureProgram);
	builder.append(", gPSVersionID=");
	builder.append(gPSVersionID);
	builder.append(", gPSLatitudeRef=");
	builder.append(gPSLatitudeRef);
	builder.append(", metaCreationDate=");
	builder.append(metaCreationDate);
	builder.append(", exifFNumber=");
	builder.append(exifFNumber);
	builder.append(", gPSAltitudeRef=");
	builder.append(gPSAltitudeRef);
	builder.append(", exposureTime=");
	builder.append(exposureTime);
	builder.append(", gPSLongitude=");
	builder.append(gPSLongitude);
	builder.append(", creationDate=");
	builder.append(creationDate);
	builder.append(", iSOSpeedRatings=");
	builder.append(iSOSpeedRatings);
	builder.append(", make=");
	builder.append(make);
	builder.append(", orientation=");
	builder.append(orientation);
	builder.append(", meteringMode=");
	builder.append(meteringMode);
	builder.append(", tiffOrientation=");
	builder.append(tiffOrientation);
	builder.append(", gPSLongitudeRef=");
	builder.append(gPSLongitudeRef);
	builder.append(", tiffSoftware=");
	builder.append(tiffSoftware);
	builder.append(", exifFocalLength=");
	builder.append(exifFocalLength);
	builder.append(", filename=");
	builder.append(filename);
	builder.append(", xMPValueCount=");
	builder.append(xMPValueCount);
	builder.append(", geoLong=");
	builder.append(geoLong);
	builder.append(", fileOwner=");
	builder.append(fileOwner);
	builder.append(", software=");
	builder.append(software);
	builder.append(", exifImageHeight=");
	builder.append(exifImageHeight);
	builder.append(", tiffYResolution=");
	builder.append(tiffYResolution);
	builder.append(", yResolution=");
	builder.append(yResolution);
	builder.append(", gPSLatitude=");
	builder.append(gPSLatitude);
	builder.append(", dcDescription=");
	builder.append(dcDescription);
	builder.append(", geoLat=");
	builder.append(geoLat);
	builder.append(", flashPixVersion=");
	builder.append(flashPixVersion);
	builder.append(", dataPrecision=");
	builder.append(dataPrecision);
	builder.append(", whiteBalance=");
	builder.append(whiteBalance);
	builder.append(", tiffImageLength=");
	builder.append(tiffImageLength);
	builder.append(", description=");
	builder.append(description);
	builder.append(", dctermsCreated=");
	builder.append(dctermsCreated);
	builder.append(", dctermsModified=");
	builder.append(dctermsModified);
	builder.append(", lastModified=");
	builder.append(lastModified);
	builder.append(", filePermissions=");
	builder.append(filePermissions);
	builder.append(", exifExposureTime=");
	builder.append(exifExposureTime);
	builder.append(", lastSaveDate=");
	builder.append(lastSaveDate);
	builder.append(", gPSAltitude=");
	builder.append(gPSAltitude);
	builder.append(", absolutePath=");
	builder.append(absolutePath);
	builder.append(", colorSpace=");
	builder.append(colorSpace);
	builder.append(", fileSize=");
	builder.append(fileSize);
	builder.append(", metaSaveDate=");
	builder.append(metaSaveDate);
	builder.append(", fileCreationTime=");
	builder.append(fileCreationTime);
	builder.append(", dateTimeDigitized=");
	builder.append(dateTimeDigitized);
	builder.append(", fileName=");
	builder.append(fileName);
	builder.append(", contentType=");
	builder.append(contentType);
	builder.append(", apertureValue=");
	builder.append(apertureValue);
	builder.append(", xParsedBy=");
	builder.append(xParsedBy);
	builder.append(", fileModifiedDate=");
	builder.append(fileModifiedDate);
	builder.append(", tiffXResolution=");
	builder.append(tiffXResolution);
	builder.append(", fileLastModifiedTime=");
	builder.append(fileLastModifiedTime);
	builder.append(", exifDateTimeOriginal=");
	builder.append(exifDateTimeOriginal);
	builder.append(", dateTime=");
	builder.append(dateTime);
	builder.append(", exifImageWidth=");
	builder.append(exifImageWidth);
	builder.append(", imageHeight=");
	builder.append(imageHeight);
	builder.append(", imageWidth=");
	builder.append(imageWidth);
	builder.append(", unknownTag0xc62f=");
	builder.append(unknownTag0xc62f);
	builder.append(", resolutionUnit=");
	builder.append(resolutionUnit);
	builder.append(", tiffModel=");
	builder.append(tiffModel);
	builder.append(", exifIsoSpeedRatings=");
	builder.append(exifIsoSpeedRatings);
	builder.append(", maxApertureValue=");
	builder.append(maxApertureValue);
	builder.append(", exposureMode=");
	builder.append(exposureMode);
	builder.append(", model=");
	builder.append(model);
	builder.append(", fileLastAccessTime=");
	builder.append(fileLastAccessTime);
	builder.append(", tiffImageWidth=");
	builder.append(tiffImageWidth);
	builder.append(", whiteBalanceMode=");
	builder.append(whiteBalanceMode);
	builder.append("]");
	return builder.toString();
}

public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}

public String getCompression() {
	return compression;
}

public void setCompression(String compression) {
	this.compression = compression;
}

public String getExifVersion() {
	return exifVersion;
}

public void setExifVersion(String exifVersion) {
	this.exifVersion = exifVersion;
}

public String getComponentsConfiguration() {
	return componentsConfiguration;
}

public void setComponentsConfiguration(String componentsConfiguration) {
	this.componentsConfiguration = componentsConfiguration;
}

public String getFileGroup() {
	return fileGroup;
}

public void setFileGroup(String fileGroup) {
	this.fileGroup = fileGroup;
}

public String getCompressionType() {
	return compressionType;
}

public void setCompressionType(String compressionType) {
	this.compressionType = compressionType;
}

public String getImageDescription() {
	return imageDescription;
}

public void setImageDescription(String imageDescription) {
	this.imageDescription = imageDescription;
}

public String getNumberOfComponents() {
	return numberOfComponents;
}

public void setNumberOfComponents(String numberOfComponents) {
	this.numberOfComponents = numberOfComponents;
}

public String getComponent2() {
	return component2;
}

public void setComponent2(String component2) {
	this.component2 = component2;
}

public String getFocalLength() {
	return focalLength;
}

public void setFocalLength(String focalLength) {
	this.focalLength = focalLength;
}

public String getComponent1() {
	return component1;
}

public void setComponent1(String component1) {
	this.component1 = component1;
}

public String getyCbCrPositioning() {
	return yCbCrPositioning;
}

public void setyCbCrPositioning(String yCbCrPositioning) {
	this.yCbCrPositioning = yCbCrPositioning;
}

public String getTiffResolutionUnit() {
	return tiffResolutionUnit;
}

public void setTiffResolutionUnit(String tiffResolutionUnit) {
	this.tiffResolutionUnit = tiffResolutionUnit;
}

public String getUuid() {
	return uuid;
}

public void setUuid(String uuid) {
	this.uuid = uuid;
}

public String getDateTimeOriginal() {
	return dateTimeOriginal;
}

public void setDateTimeOriginal(String dateTimeOriginal) {
	this.dateTimeOriginal = dateTimeOriginal;
}

public String getShutterSpeedValue() {
	return shutterSpeedValue;
}

public void setShutterSpeedValue(String shutterSpeedValue) {
	this.shutterSpeedValue = shutterSpeedValue;
}

public String getxResolution() {
	return xResolution;
}

public void setxResolution(String xResolution) {
	this.xResolution = xResolution;
}

public String getTiffMake() {
	return tiffMake;
}

public void setTiffMake(String tiffMake) {
	this.tiffMake = tiffMake;
}

public String getPath() {
	return path;
}

public void setPath(String path) {
	this.path = path;
}

public String getPhotometricInterpretation() {
	return photometricInterpretation;
}

public void setPhotometricInterpretation(String photometricInterpretation) {
	this.photometricInterpretation = photometricInterpretation;
}

public String getComponent3() {
	return component3;
}

public void setComponent3(String component3) {
	this.component3 = component3;
}

public String getUniqueImageID() {
	return uniqueImageID;
}

public void setUniqueImageID(String uniqueImageID) {
	this.uniqueImageID = uniqueImageID;
}

public String getfNumber() {
	return fNumber;
}

public void setfNumber(String fNumber) {
	this.fNumber = fNumber;
}

public String getModified() {
	return modified;
}

public void setModified(String modified) {
	this.modified = modified;
}

public String getFocalLength35() {
	return focalLength35;
}

public void setFocalLength35(String focalLength35) {
	this.focalLength35 = focalLength35;
}

public String getTiffBitsPerSample() {
	return tiffBitsPerSample;
}

public void setTiffBitsPerSample(String tiffBitsPerSample) {
	this.tiffBitsPerSample = tiffBitsPerSample;
}

public String getExposureProgram() {
	return exposureProgram;
}

public void setExposureProgram(String exposureProgram) {
	this.exposureProgram = exposureProgram;
}

public String getgPSVersionID() {
	return gPSVersionID;
}

public void setgPSVersionID(String gPSVersionID) {
	this.gPSVersionID = gPSVersionID;
}

public String getgPSLatitudeRef() {
	return gPSLatitudeRef;
}

public void setgPSLatitudeRef(String gPSLatitudeRef) {
	this.gPSLatitudeRef = gPSLatitudeRef;
}

public String getMetaCreationDate() {
	return metaCreationDate;
}

public void setMetaCreationDate(String metaCreationDate) {
	this.metaCreationDate = metaCreationDate;
}

public String getExifFNumber() {
	return exifFNumber;
}

public void setExifFNumber(String exifFNumber) {
	this.exifFNumber = exifFNumber;
}

public String getgPSAltitudeRef() {
	return gPSAltitudeRef;
}

public void setgPSAltitudeRef(String gPSAltitudeRef) {
	this.gPSAltitudeRef = gPSAltitudeRef;
}

public String getExposureTime() {
	return exposureTime;
}

public void setExposureTime(String exposureTime) {
	this.exposureTime = exposureTime;
}

public String getgPSLongitude() {
	return gPSLongitude;
}

public void setgPSLongitude(String gPSLongitude) {
	this.gPSLongitude = gPSLongitude;
}

public String getCreationDate() {
	return creationDate;
}

public void setCreationDate(String creationDate) {
	this.creationDate = creationDate;
}

public String getiSOSpeedRatings() {
	return iSOSpeedRatings;
}

public void setiSOSpeedRatings(String iSOSpeedRatings) {
	this.iSOSpeedRatings = iSOSpeedRatings;
}

public String getMake() {
	return make;
}

public void setMake(String make) {
	this.make = make;
}

public String getOrientation() {
	return orientation;
}

public void setOrientation(String orientation) {
	this.orientation = orientation;
}

public String getMeteringMode() {
	return meteringMode;
}

public void setMeteringMode(String meteringMode) {
	this.meteringMode = meteringMode;
}

public String getTiffOrientation() {
	return tiffOrientation;
}

public void setTiffOrientation(String tiffOrientation) {
	this.tiffOrientation = tiffOrientation;
}

public String getgPSLongitudeRef() {
	return gPSLongitudeRef;
}

public void setgPSLongitudeRef(String gPSLongitudeRef) {
	this.gPSLongitudeRef = gPSLongitudeRef;
}

public String getTiffSoftware() {
	return tiffSoftware;
}

public void setTiffSoftware(String tiffSoftware) {
	this.tiffSoftware = tiffSoftware;
}

public String getExifFocalLength() {
	return exifFocalLength;
}

public void setExifFocalLength(String exifFocalLength) {
	this.exifFocalLength = exifFocalLength;
}

public String getFilename() {
	return filename;
}

public void setFilename(String filename) {
	this.filename = filename;
}

public String getxMPValueCount() {
	return xMPValueCount;
}

public void setxMPValueCount(String xMPValueCount) {
	this.xMPValueCount = xMPValueCount;
}

public String getGeoLong() {
	return geoLong;
}

public void setGeoLong(String geoLong) {
	this.geoLong = geoLong;
}

public String getFileOwner() {
	return fileOwner;
}

public void setFileOwner(String fileOwner) {
	this.fileOwner = fileOwner;
}

public String getSoftware() {
	return software;
}

public void setSoftware(String software) {
	this.software = software;
}

public String getExifImageHeight() {
	return exifImageHeight;
}

public void setExifImageHeight(String exifImageHeight) {
	this.exifImageHeight = exifImageHeight;
}

public String getTiffYResolution() {
	return tiffYResolution;
}

public void setTiffYResolution(String tiffYResolution) {
	this.tiffYResolution = tiffYResolution;
}

public String getyResolution() {
	return yResolution;
}

public void setyResolution(String yResolution) {
	this.yResolution = yResolution;
}

public String getgPSLatitude() {
	return gPSLatitude;
}

public void setgPSLatitude(String gPSLatitude) {
	this.gPSLatitude = gPSLatitude;
}

public String getDcDescription() {
	return dcDescription;
}

public void setDcDescription(String dcDescription) {
	this.dcDescription = dcDescription;
}

public String getGeoLat() {
	return geoLat;
}

public void setGeoLat(String geoLat) {
	this.geoLat = geoLat;
}

public String getFlashPixVersion() {
	return flashPixVersion;
}

public void setFlashPixVersion(String flashPixVersion) {
	this.flashPixVersion = flashPixVersion;
}

public String getDataPrecision() {
	return dataPrecision;
}

public void setDataPrecision(String dataPrecision) {
	this.dataPrecision = dataPrecision;
}

public String getWhiteBalance() {
	return whiteBalance;
}

public void setWhiteBalance(String whiteBalance) {
	this.whiteBalance = whiteBalance;
}

public String getTiffImageLength() {
	return tiffImageLength;
}

public void setTiffImageLength(String tiffImageLength) {
	this.tiffImageLength = tiffImageLength;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public String getDctermsCreated() {
	return dctermsCreated;
}

public void setDctermsCreated(String dctermsCreated) {
	this.dctermsCreated = dctermsCreated;
}

public String getDctermsModified() {
	return dctermsModified;
}

public void setDctermsModified(String dctermsModified) {
	this.dctermsModified = dctermsModified;
}

public String getLastModified() {
	return lastModified;
}

public void setLastModified(String lastModified) {
	this.lastModified = lastModified;
}

public String getFilePermissions() {
	return filePermissions;
}

public void setFilePermissions(String filePermissions) {
	this.filePermissions = filePermissions;
}

public String getExifExposureTime() {
	return exifExposureTime;
}

public void setExifExposureTime(String exifExposureTime) {
	this.exifExposureTime = exifExposureTime;
}

public String getLastSaveDate() {
	return lastSaveDate;
}

public void setLastSaveDate(String lastSaveDate) {
	this.lastSaveDate = lastSaveDate;
}

public String getgPSAltitude() {
	return gPSAltitude;
}

public void setgPSAltitude(String gPSAltitude) {
	this.gPSAltitude = gPSAltitude;
}

public String getAbsolutePath() {
	return absolutePath;
}

public void setAbsolutePath(String absolutePath) {
	this.absolutePath = absolutePath;
}

public String getColorSpace() {
	return colorSpace;
}

public void setColorSpace(String colorSpace) {
	this.colorSpace = colorSpace;
}

public String getFileSize() {
	return fileSize;
}

public void setFileSize(String fileSize) {
	this.fileSize = fileSize;
}

public String getMetaSaveDate() {
	return metaSaveDate;
}

public void setMetaSaveDate(String metaSaveDate) {
	this.metaSaveDate = metaSaveDate;
}

public String getFileCreationTime() {
	return fileCreationTime;
}

public void setFileCreationTime(String fileCreationTime) {
	this.fileCreationTime = fileCreationTime;
}

public String getDateTimeDigitized() {
	return dateTimeDigitized;
}

public void setDateTimeDigitized(String dateTimeDigitized) {
	this.dateTimeDigitized = dateTimeDigitized;
}

public String getFileName() {
	return fileName;
}

public void setFileName(String fileName) {
	this.fileName = fileName;
}

public String getContentType() {
	return contentType;
}

public void setContentType(String contentType) {
	this.contentType = contentType;
}

public String getApertureValue() {
	return apertureValue;
}

public void setApertureValue(String apertureValue) {
	this.apertureValue = apertureValue;
}

public String getxParsedBy() {
	return xParsedBy;
}

public void setxParsedBy(String xParsedBy) {
	this.xParsedBy = xParsedBy;
}

public String getFileModifiedDate() {
	return fileModifiedDate;
}

public void setFileModifiedDate(String fileModifiedDate) {
	this.fileModifiedDate = fileModifiedDate;
}

public String getTiffXResolution() {
	return tiffXResolution;
}

public void setTiffXResolution(String tiffXResolution) {
	this.tiffXResolution = tiffXResolution;
}

public String getFileLastModifiedTime() {
	return fileLastModifiedTime;
}

public void setFileLastModifiedTime(String fileLastModifiedTime) {
	this.fileLastModifiedTime = fileLastModifiedTime;
}

public String getExifDateTimeOriginal() {
	return exifDateTimeOriginal;
}

public void setExifDateTimeOriginal(String exifDateTimeOriginal) {
	this.exifDateTimeOriginal = exifDateTimeOriginal;
}

public String getDateTime() {
	return dateTime;
}

public void setDateTime(String dateTime) {
	this.dateTime = dateTime;
}

public String getExifImageWidth() {
	return exifImageWidth;
}

public void setExifImageWidth(String exifImageWidth) {
	this.exifImageWidth = exifImageWidth;
}

public String getImageHeight() {
	return imageHeight;
}

public void setImageHeight(String imageHeight) {
	this.imageHeight = imageHeight;
}

public String getImageWidth() {
	return imageWidth;
}

public void setImageWidth(String imageWidth) {
	this.imageWidth = imageWidth;
}

public String getUnknownTag0xc62f() {
	return unknownTag0xc62f;
}

public void setUnknownTag0xc62f(String unknownTag0xc62f) {
	this.unknownTag0xc62f = unknownTag0xc62f;
}

public String getResolutionUnit() {
	return resolutionUnit;
}

public void setResolutionUnit(String resolutionUnit) {
	this.resolutionUnit = resolutionUnit;
}

public String getTiffModel() {
	return tiffModel;
}

public void setTiffModel(String tiffModel) {
	this.tiffModel = tiffModel;
}

public String getExifIsoSpeedRatings() {
	return exifIsoSpeedRatings;
}

public void setExifIsoSpeedRatings(String exifIsoSpeedRatings) {
	this.exifIsoSpeedRatings = exifIsoSpeedRatings;
}

public String getMaxApertureValue() {
	return maxApertureValue;
}

public void setMaxApertureValue(String maxApertureValue) {
	this.maxApertureValue = maxApertureValue;
}

public String getExposureMode() {
	return exposureMode;
}

public void setExposureMode(String exposureMode) {
	this.exposureMode = exposureMode;
}

public String getModel() {
	return model;
}

public void setModel(String model) {
	this.model = model;
}

public String getFileLastAccessTime() {
	return fileLastAccessTime;
}

public void setFileLastAccessTime(String fileLastAccessTime) {
	this.fileLastAccessTime = fileLastAccessTime;
}

public String getTiffImageWidth() {
	return tiffImageWidth;
}

public void setTiffImageWidth(String tiffImageWidth) {
	this.tiffImageWidth = tiffImageWidth;
}

public String getWhiteBalanceMode() {
	return whiteBalanceMode;
}

public void setWhiteBalanceMode(String whiteBalanceMode) {
	this.whiteBalanceMode = whiteBalanceMode;
}


}
package com.PCPartPickerFinal;

public class PCPartsList {

	private CPUList cpu;
	private MOBOList mobo;
	private CASEList cases;
	private GPUList gpu;
	private RAMList ram;
	
	public CPUList getCpu() {
		return cpu;
	}
	public void setCpu(CPUList cpu) {
		this.cpu = cpu;
	}
	public MOBOList getMobo() {
		return mobo;
	}
	public void setMobo(MOBOList mobo) {
		this.mobo = mobo;
	}
	public CASEList getCases() {
		return cases;
	}
	public void setCases(CASEList cases) {
		this.cases = cases;
	}
	public GPUList getGpu() {
		return gpu;
	}
	public void setGpu(GPUList gpu) {
		this.gpu = gpu;
	}
	public RAMList getRam() {
		return ram;
	}
	public void setRam(RAMList ram) {
		this.ram = ram;
	}
	
	public PCPartsList() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "PCPartsList [cpu=" + cpu + ", mobo=" + mobo + ", cases=" + cases + ", gpu=" + gpu + ", ram=" + ram
				+ "]";
	}
	
	public PCPartsList(CPUList cpu, MOBOList mobo, CASEList cases, GPUList gpu, RAMList ram) {
		super();
		this.cpu = cpu;
		this.mobo = mobo;
		this.cases = cases;
		this.gpu = gpu;
		this.ram = ram;
	}
	
	
}

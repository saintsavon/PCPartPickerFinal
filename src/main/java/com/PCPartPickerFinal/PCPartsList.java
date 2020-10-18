package com.PCPartPickerFinal;

public class PCPartsList {

	private CPUList cpu;
	private MOBOList mobo;
	private CASEList cases;
	private GPUList gpu;
	
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
	
	@Override
	public String toString() {
		return "PCPartsList [cpu=" + cpu + ", mobo=" + mobo + ", cases=" + cases + ", gpu=" + gpu + "]";
	}
	
	public PCPartsList() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public PCPartsList(CPUList cpu, MOBOList mobo, CASEList cases, GPUList gpu) {
		super();
		this.cpu = cpu;
		this.mobo = mobo;
		this.cases = cases;
		this.gpu = gpu;
	}
	
}

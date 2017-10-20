package org.usfirst.frc.team4201.robot.commands;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team4201.robot.Robot;

/**
 *
 */
public class DeployGroundGearIntake extends Command {
	public DeployGroundGearIntake() {
		// Use requires() here to declare subsystem dependencies
		requires(Robot.groundGearIntake);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
		if(Robot.groundGearIntake.getIntakeStatus() != DoubleSolenoid.Value.kForward)
			Robot.groundGearIntake.deployIntake();
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
	}
}

// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotContainer;

public class MoveMotorSub extends SubsystemBase {
  /** Creates a new MoveMotorSub. */
  public static Talon motor;
  public MoveMotorSub() {
    motor = new Talon(2);
  }

  public static void moveThatMotor() {
    motor.set(RobotContainer.driverJoy.getRawAxis(0));
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}

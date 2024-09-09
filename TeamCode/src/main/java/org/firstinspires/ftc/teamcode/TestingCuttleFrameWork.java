package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.roboctopi.cuttlefishftcbridge.devices.CuttleMotor;
import com.roboctopi.cuttlefishftcbridge.devices.CuttleRevHub;

@TeleOp( name = "testHeex")
public class TestingCuttleFrameWork extends LinearOpMode {
    public CuttleRevHub ctrlHub;
    public CuttleRevHub expHub;
    public CuttleMotor motorHex;

    //Just testing Git
    @Override
    public void runOpMode() throws InterruptedException {

        ctrlHub = new CuttleRevHub(hardwareMap,CuttleRevHub.HubTypes.CONTROL_HUB);
        expHub = new CuttleRevHub(hardwareMap,"Expansion Hub");

        motorHex = ctrlHub.getMotor(0);

        waitForStart();

        while (opModeIsActive()){

            if(gamepad1.a) {
                motorHex.setPower(0.5);
            }

        }
    }
}
